package com.example.daggerdemo.di

import com.example.daggerdemo.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [HPModule::class, PowerAdapterModule::class])

@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
}