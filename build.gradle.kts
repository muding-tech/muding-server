plugins {
    java
    jacoco
    libs.plugins.kotlinPluginSerialization
    id("org.jlleitschuh.gradle.ktlint") version "13.0.0"
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
    id("com.linecorp.build-recipe-plugin") version "1.1.1"

}

buildscript {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
    }
}

repositories {
    mavenCentral()
    google()
}