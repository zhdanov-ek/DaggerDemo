package com.example.daggerdemo

import com.example.daggerdemo.model.Printer
import dagger.Component

@Component(modules = [CanonModule::class])
interface AppComponent {
    fun getPrinter(): Printer
}