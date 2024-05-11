

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        // Otros repositorios si es necesario
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.1.1") // Versión correcta del plugin de Android
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // Versión correcta del plugin de Kotlin
        classpath ("com.google.gms:google-services:4.4.1") // Plugin de servicios de Google
    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}