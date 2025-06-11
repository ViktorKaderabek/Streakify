plugins {
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)

    // KMP
    alias(libs.plugins.kotlin.multiplatform).apply(false)
    alias(libs.plugins.compose.multiplatform).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)

    // Lint
    alias(libs.plugins.ktlint).apply(false)
    alias(libs.plugins.detekt).apply(false)

    // Firebase
    alias(libs.plugins.google.services).apply(false)
}
