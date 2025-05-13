group = "org.demo.app.customer"
version = "1.0.0-SNAPSHOT"

plugins {
    id("apps-common")
    id("java-library")
    alias(libs.plugins.spring.boot)
}

dependencies{
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")
}