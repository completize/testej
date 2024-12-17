plugins {
    kotlin("jvm") version "2.0.20"
    id("com.vanniktech.maven.publish") version "0.28.0"
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

mavenPublishing {
    coordinates(
        groupId = projectName,
        artifactId = "testej",
        version = projectVersion
    )
}