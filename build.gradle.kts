buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.45")
    }
    tasks.register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}

plugins {
    id("com.google.gms.google-services") version "4.3.15" apply false
}
