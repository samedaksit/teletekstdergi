package com.example.teletekstdergi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teletekstdergi.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}