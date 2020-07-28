package com.example.daggerdemo.di

import com.example.daggerdemo.model.Canon
import com.example.daggerdemo.model.Printer
import dagger.Module
import dagger.Provides

@Module
class CanonModule {

    @Provides
    fun provideCanon(): Printer {
        return Canon()
    }
}