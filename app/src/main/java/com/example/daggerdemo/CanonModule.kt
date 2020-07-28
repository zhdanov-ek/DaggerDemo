package com.example.daggerdemo

import com.example.daggerdemo.model.Canon
import com.example.daggerdemo.model.Printer
import dagger.Module
import dagger.Provides

@Module
class CanonModule {

    @Provides
    fun getCanon(): Printer {
        return Canon()
    }
}