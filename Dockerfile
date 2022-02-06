#syntax=docker/dockerfile:1


FROM openjdk:11

RUN apt-get update
RUN apt install -y libxrender1 libxtst6 libxi6
WORKDIR /ImmatricolazioneASD
ADD target/ImmatricolazioneASD-1.0-SNAPSHOT.jar .
#COPY . /myapp
#WORKDIR /src/main/java/it/unimol/sm

#RUN javac Main.java
CMD ["java",  "-jar", "ImmatricolazioneASD-1.0-SNAPSHOT.jar"]



#FROM openjdk:17-jdk-ubuntu:18.04
#RUN apk update
#
#RUN apk add libxtst \libxi
#
#WORKDIR /ImmatricolazioneASD
#ADD target/ImmatricolazioneASD-1.0-SNAPSHOT.jar .
#
#CMD ["java",  "-jar", "ImmatricolazioneASD-1.0-SNAPSHOT.jar"]

#FROM ubuntu:14.04
#RUN sudo apt-get update
#RUN sudo apt-get install openjdk-11-jdk
#CMD java

#
#FROM ubuntu:18.04
#RUN apt-get update &&   \ apt-get install -y openjdk-8-jdk && \
#    apt-get install -y ant && \
#    apt-get clean;
#
#
#CMD /usr/bin/firefox
