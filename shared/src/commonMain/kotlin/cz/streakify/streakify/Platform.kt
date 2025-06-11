package cz.streakify.streakify

import cz.streakify.streakify.di.coreModule
import cz.streakify.streakify.di.platformModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration
        modules(platformModule)
        modules(coreModule)
    }
}
