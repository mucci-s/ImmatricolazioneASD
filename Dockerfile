#syntax=docker/dockerfile:1


FROM openjdk:11

RUN apt-get update
RUN apt install -y libxrender1 libxtst6 libxi6
WORKDIR /ImmatricolazioneASD
ADD target/ImmatricolazioneASD-1.0-SNAPSHOT.jar .

CMD ["java",  "-jar", "ImmatricolazioneASD-1.0-SNAPSHOT.jar"]


