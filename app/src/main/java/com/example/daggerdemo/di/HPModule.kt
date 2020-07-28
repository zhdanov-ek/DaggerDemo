package com.example.daggerdemo.di

import com.example.daggerdemo.model.HewlettPackard
import com.example.daggerdemo.model.PowerAdapter
import com.example.daggerdemo.model.Printer
import dagger.Module
import dagger.Provides

@Module
class HPModule {

    @Provides
    fun provideHewlettPackard(powerAdapter: PowerAdapter): Printer {
        return HewlettPackard(powerAdapter)
    }
}