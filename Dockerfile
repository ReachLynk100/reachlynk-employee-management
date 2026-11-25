# Use Java 21 runtime
FROM eclipse-temurin:21-jre

# Set application working directory
WORKDIR /app

# Copy executable Spring Boot JAR
COPY target/employee-management-1.0.0.jar app.jar

# Application port
EXPOSE 8080

# Start Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
