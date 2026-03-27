FROM eclipse-temurin:17-jdk-jammy

VOLUME /tmp

COPY target/rms.jar rms.jar

ENTRYPOINT ["java","-jar","/rms.jar"]