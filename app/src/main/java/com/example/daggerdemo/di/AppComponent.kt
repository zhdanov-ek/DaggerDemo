package com.example.daggerdemo.di

import com.example.daggerdemo.model.PowerAdapter
import com.example.daggerdemo.model.Printer
import dagger.Component

@Component(modules = [HPModule::class, PowerAdapterModule::class])
interface AppComponent {
    fun getPrinter(): Printer
    fun getPowerAdapter(): PowerAdapter
}