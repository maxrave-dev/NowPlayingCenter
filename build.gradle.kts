plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    `maven-publish`
}

subprojects {
    apply(plugin = "java-library") // or "kotlin" if you prefer
    apply(plugin = "maven-publish")

    group = "org.simpmusic"
    version = "0.0.1"

    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
    }
}