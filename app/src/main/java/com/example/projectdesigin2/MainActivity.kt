package com.example.projectdesigin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aerobic.setOnClickListener{
            val intent = Intent(this, Aerbic::lass.java)
            startActivity(intent)
        }







    }
}