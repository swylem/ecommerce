FROM openjdk:24-slim-bookworm
WORKDIR /app
COPY target/user-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]