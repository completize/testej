plugins {
    kotlin("jvm") version "2.0.20"
    id("maven-publish")
}

group = "com.teste.j"
version = "1.0-SNAPSHOT"

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

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                pom {
                    name = "My Library"
                    artifactId = "testej"
                    groupId = group.toString()
                    version = version.toString()
                    description = "A concise description of my library"
                    url = "http://www.example.com/library"
                }
            }
        }
    }
}