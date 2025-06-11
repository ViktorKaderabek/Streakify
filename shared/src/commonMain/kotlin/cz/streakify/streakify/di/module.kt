package cz.streakify.streakify.di

import org.koin.core.module.Module
import org.koin.dsl.module

expect val platformModule: Module

internal val coreModule =
    module {
    }
