package com.example.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerdemo.model.Printer
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var printer: Printer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // initializing object Printer
        App.appComponent.inject(this)

        setContentView(R.layout.activity_main)

        textView.text = printer.print()

    }
}