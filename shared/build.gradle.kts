import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)

    // Lint
    alias(libs.plugins.ktlint)
    alias(libs.plugins.detekt)
}

kotlin {
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { target ->
        target.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            // Compose
            implementation(libs.compose.ui)
            implementation(libs.compose.ui)
            implementation(libs.compose.runtime)
            implementation(libs.compose.material)
            implementation(libs.compose.foundation)

            // Koin
            api(libs.koin.core)
        }

        androidMain.dependencies {
            // Compose
            implementation(libs.androidx.activity.compose)

            // Koin
            api(libs.koin.android)
        }
    }
}

android {
    namespace = "cz.streakify.streakify"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
