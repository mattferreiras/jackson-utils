import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // Jackson
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}