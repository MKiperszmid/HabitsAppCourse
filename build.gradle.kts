buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }
    tasks.register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
   /* ext {
        compose_version = '1.3.2'
        hilt_version = '2.45'
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id 'com.android.application' version '7.4.0' apply false
    id 'com.android.library' version '7.4.0' apply false
    id 'org.jetbrains.kotlin.android' version '1.7.20' apply false
    id 'com.google.dagger.hilt.android' version "$hilt_version" apply false
    id 'com.google.gms.google-services' version '4.3.15' apply false
}*/