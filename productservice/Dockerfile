FROM openjdk:24-slim-bookworm
WORKDIR /app
COPY target/product-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]