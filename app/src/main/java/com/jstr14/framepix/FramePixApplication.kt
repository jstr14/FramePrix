package com.jstr14.framepix

import android.app.Application
import com.jstr14.login.loginModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FramePixApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize Koin
        startKoin {
            androidContext(this@FramePixApplication)
            modules(
                loginModule,
            )
        }
    }
}