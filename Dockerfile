# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/springboot-k8s-0.0.1-SNAPSHOT.jar /app/springboot-k8s.jar

# Expose port 8085
EXPOSE 8085

# Run the JAR file
ENTRYPOINT ["java", "-jar", springboot-k8s.jar"]
