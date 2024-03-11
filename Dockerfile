FROM openjdk:17

ARG JAR_FILE=*.jar
COPY /build/libs/$JAR_FILE mussangdeul.jar
COPY .env ./

LABEL authors="mussangdeul"

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "mussangdeul.jar"]
