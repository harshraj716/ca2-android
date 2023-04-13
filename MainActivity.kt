package com.example.ca2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var customView=CvDemo2(this)
        super.onCreate(savedInstanceState)
        setContentView(customView)
    }
}