plugins {
    alias(libs.plugins.kotlin.jvm)
    id("maven-publish")
}

group = "org.simpmusic"

repositories {
    mavenCentral()
}

dependencies {
    implementation(projects.jmtc)
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}