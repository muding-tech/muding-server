rootProject.name = "muding-server"

dependencyResolutionManagement {
    buildscript {
        repositories {
            gradlePluginPortal()
        }
    }

    @Suppress("UnstableApiUsage")
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        google()
    }
}