
FROM openjdk:17



#RUN curl -L -H "Accept: application/vnd.github.v3+json" -H "Authorization: token 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" https://api.github.com/repos/simtape/homework_asd/actions/artifacts/68554061/zip --output homework.zip

WORKDIR /ImmatricolazioneASD
ADD target/ImmatricolazioneASD-1.0-SNAPSHOT.jar .

CMD ["java",  "-jar", "ImmatricolazioneASD-1.0-SNAPSHOT.jar"]


#FROM ubuntu:14.04
#RUN apt-get update && apt-get install -y firefox
#CMD /usr/bin/firefox

