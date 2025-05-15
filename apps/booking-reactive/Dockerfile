# ---------- Stage 1: Build ----------
FROM eclipse-temurin:17-jdk AS build

WORKDIR /workspace

# Copy everything so Gradle can resolve modules, settings, buildSrc, etc.
COPY . .

# Build only the booking app module
RUN chmod +x ./gradlew && ./gradlew :apps:booking-reactive:bootJar -x test --no-daemon

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre

WORKDIR /app
COPY --from=build /workspace/apps/booking-reactive/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
