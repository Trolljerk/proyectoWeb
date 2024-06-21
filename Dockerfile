FROM maven:3.8.5-openjdk-17 AS build

# Create a new directory for the application source code
WORKDIR /app

# Copy the source code to the /app directory
COPY . /app

# Change the working directory to /app
WORKDIR /app

# Build the application
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

# Copy the built application from the build stage
COPY --from=build /app/target/myapp.jar /usr/local/lib/myapp.jar

# Set the entry point
ENTRYPOINT ["java", "-jar", "/usr/local/lib/myapp.jar"]