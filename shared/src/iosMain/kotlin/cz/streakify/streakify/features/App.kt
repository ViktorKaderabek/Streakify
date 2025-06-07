package cz.streakify.streakify.features

import androidx.compose.ui.window.ComposeUIViewController
import cz.streakify.streakify.features.home.presentation.HomeScreen
import platform.UIKit.UIViewController

fun App(): UIViewController = ComposeUIViewController { HomeScreen() }
