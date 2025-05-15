plugins {
    id("java")
}

dependencies {
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")

    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    implementation("org.json:json:20240303")



}

repositories {
    mavenCentral()

}

tasks.test {
    useJUnitPlatform()
}
