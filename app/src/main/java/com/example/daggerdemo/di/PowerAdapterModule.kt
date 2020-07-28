package com.example.daggerdemo.di

import com.example.daggerdemo.model.PowerAdapter
import dagger.Module
import dagger.Provides

@Module
class PowerAdapterModule {

    @Provides
    fun providePowerAdapter(): PowerAdapter {
        val adapter = PowerAdapter()
        adapter.selectRegion(PowerAdapter.Region.US)
        return adapter
    }
}