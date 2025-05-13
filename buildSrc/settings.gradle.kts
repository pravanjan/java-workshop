rootProject.name = "buildSrc"

dependencyResolutionManagement {
    // reuse version catalog from the main build
    versionCatalogs {
        create("libs") { from(files("../gradle/libs.versions.toml")) }
    }
}