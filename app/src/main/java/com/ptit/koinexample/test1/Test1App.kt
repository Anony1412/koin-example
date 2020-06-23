package com.ptit.koinexample.test1

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Test1App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Test1App)
            modules(listOf(test1Module))
        }
    }
}
