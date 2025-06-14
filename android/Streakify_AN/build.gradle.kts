plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)

    // Lint
    alias(libs.plugins.ktlint)
    alias(libs.plugins.detekt)

    // Firebase
    alias(libs.plugins.google.services)
}

buildscript {
    repositories {
        mavenCentral()
    }
}

android {
    namespace = "cz.streakify.streakify.android"
    compileSdk = 35
    defaultConfig {
        applicationId = "cz.streakify.streakify.android"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Shared
    implementation(projects.shared)

    // Compose
    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    debugImplementation(libs.compose.ui.tooling)

    // Firebase
    implementation(libs.firebase.bom)
    implementation(libs.firebase.sdk)
}
