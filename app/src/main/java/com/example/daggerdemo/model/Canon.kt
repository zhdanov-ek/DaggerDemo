package com.example.daggerdemo.model

import javax.inject.Inject

class Canon @Inject constructor() :
    Printer {

    override fun print(): String {
        return "Text printed by Canon"
    }

}