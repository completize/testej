plugins {
    kotlin("jvm") version "2.0.20"
    id("maven-publish")
}

var projectName = "com.teste.j"
var projectVersion = "1.0-SNAPSHOT"

group = projectName
version = projectVersion

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing.publications.register<MavenPublication>("maven") {
    from(components["kotlin"])
}