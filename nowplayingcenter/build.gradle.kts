plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.maven.publish)
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

java {
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = false)
    signAllPublications()
    coordinates("org.simpmusic", "nowplayingcenter", libs.versions.library.get())
    pom {
        name.set("NowPlayingCenter")
        description.set("Wrapper MacOS API's MPNowPlayingCenter to JMTC libray")
        inceptionYear.set("2025")
        url.set("https://github.com/maxrave-dev/NowPlayingCenter")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://github.com/maxrave-dev/NowPlayingCenter/blob/master/LICENSE")
                distribution.set("https://github.com/maxrave-dev/NowPlayingCenter/blob/master/LICENSE")
            }
        }
        developers {
            developer {
                id.set("maxrave-dev")
                name.set("Nguyen Duc Tuan Minh")
                url.set("https://github.com/maxrave-dev/")
            }
        }
        scm {
            url.set("https://github.com/maxrave-dev/NowPlayingCenter")
            connection.set("scm:git:git://github.com/maxrave-dev/NowPlayingCenter.git")
            developerConnection.set("scm:git:ssh://git@github.com/maxrave-dev/NowPlayingCenter.git")
        }
    }
}