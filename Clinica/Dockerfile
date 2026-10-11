FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/Clinica.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]