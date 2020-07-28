package com.example.daggerdemo.model

import javax.inject.Inject

class HewlettPackard @Inject constructor(private val powerAdapter: PowerAdapter): Printer {

    override fun print(): String {
        return "Text printed by HP (using ${powerAdapter.getPower()} V)"
    }
}