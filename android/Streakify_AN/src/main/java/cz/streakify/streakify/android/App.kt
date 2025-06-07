package cz.streakify.streakify.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import cz.streakify.streakify.initKoin as initKoinAndroid

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoinAndroid {
            androidContext(this@App)
        }
    }
}
