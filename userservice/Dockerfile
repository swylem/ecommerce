FROM openjdk:24-slim-bookworm
ARG JAR_FILE=target/user-service.jar
COPY ${JAR_FILE} app.jar
RUN chmod +r /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]