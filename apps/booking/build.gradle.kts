group = "org.demo.app.booking"
version = "1.0.0-SNAPSHOT"

plugins {
    id("apps-common")
    id("java-library")
    alias(libs.plugins.spring.boot)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // set to the latest Kotlin-supported target
    }
}
tasks {
    // Disable default JAR (no dependencies)
    jar {
        enabled = false
    }

    // Keep the Spring Boot fat jar
    bootJar {
        enabled = true
    }
}

dependencies{
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")


}