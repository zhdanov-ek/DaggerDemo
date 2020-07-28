package com.example.daggerdemo

import com.example.daggerdemo.model.HewlettPackard
import com.example.daggerdemo.model.Printer
import dagger.Module
import dagger.Provides

@Module
class HPModule {

    @Provides
    fun getHewlettPackard(): Printer {
        return HewlettPackard()
    }
}