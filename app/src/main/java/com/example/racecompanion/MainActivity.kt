package com.example.racecompanion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun kilk(view: View) {
        val laps = findViewById<EditText>(R.id.etLaps).text.toString().toDouble()
        val liters = findViewById<EditText>(R.id.etLiters).text.toString().toDouble()
        val calc = laps * liters
        val apply = findViewById<TextView>(R.id.tvDisplay).apply {
            text = calc.toString()
        }
    }
}
/**XD*/