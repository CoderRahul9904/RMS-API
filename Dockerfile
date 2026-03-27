FROM openjdk:17-jdk-slim

VOLUME /tmp

COPY target/rms.jar rms.jar

ENTRYPOINT ["java","-jar","/rms.jar"]