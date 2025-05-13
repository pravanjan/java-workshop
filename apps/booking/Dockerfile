# ---------- Stage 1: Build ----------
FROM eclipse-temurin:17-jdk AS build

WORKDIR /workspace

# Copy all necessary files from the root context
COPY gradlew .
COPY gradle gradle
COPY buildSrc buildSrc
COPY settings.gradle.kts .

# Copy only the booking app module
COPY apps/booking apps/booking

RUN chmod +x ./gradlew && ./gradlew :apps:booking:bootJar -x test --no-daemon

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre

WORKDIR /app
COPY --from=build /workspace/apps/booking/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
