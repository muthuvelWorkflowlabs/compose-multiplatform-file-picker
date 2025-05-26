plugins {
	id("com.android.application")
	id("org.jetbrains.compose") version "1.6.1"
    kotlin("android")
}

dependencies {
    implementation(project(":mpfilepicker"))
	implementation("androidx.activity:activity-compose:1.8.2")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.darkrockstudios.libraries.mpfilepicker.android"
        minSdk = 21
        targetSdk = 34
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    namespace = "com.darkrockstudios.libraries.mpfilepicker.android"
}
