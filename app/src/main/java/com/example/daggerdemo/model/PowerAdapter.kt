package com.example.daggerdemo.model

class PowerAdapter {
    enum class Region {US, EU}

    private var voltage: Int? = null

    fun selectRegion(region: Region) {
        voltage = if (region == Region.US) 110 else 220
    }

    fun getPower(): Int? {
        return voltage
    }
}