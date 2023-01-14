package com.example.lab5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val resultTextView: TextView = findViewById(R.id.textViewPrice)
        val price:Int = intent.getIntExtra("price",0)
        resultTextView.text = price.toString()
    }
}