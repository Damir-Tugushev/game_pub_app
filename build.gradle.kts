import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.8"
}

group = "io.github.damir-tugushev.game_pub_app"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.graphics")
}

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib", version = "1.6.0"))

    // TornadoFX
    implementation("no.tornado:tornadofx:1.7.20")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
