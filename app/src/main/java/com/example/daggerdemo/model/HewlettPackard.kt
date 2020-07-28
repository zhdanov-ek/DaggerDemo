package com.example.daggerdemo.model

import javax.inject.Inject

class HewlettPackard @Inject constructor() :
    Printer {

    override fun print(): String {
        return "Text printed by HP"
    }

}