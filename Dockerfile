FROM openjdk:17

ARG JAR_FILE=*.jar
COPY /build/libs/$JAR_FILE mussangdeul.jar

LABEL authors="mussangdeul"

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "mussangdeul.jar"]
