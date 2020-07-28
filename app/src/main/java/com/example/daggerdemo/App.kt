package com.example.daggerdemo

import android.app.Application
import com.example.daggerdemo.di.AppComponent
import com.example.daggerdemo.di.DaggerAppComponent

class App: Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()

    }
}