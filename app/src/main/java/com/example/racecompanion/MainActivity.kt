package com.example.racecompanion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apply = findViewById<TextView>(R.id.tvDisplay).apply {
            text = ""
        }
    }

    fun kilk(view: View) {
        val editText = findViewById<EditText>(R.id.etLaps)
        val editText2 = findViewById<EditText>(R.id.etLiters)
        if (TextUtils.isEmpty(editText.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tvDisplay).apply {
                text = "Please enter the number of laps"
            }
        }
        else if (TextUtils.isEmpty(editText2.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tvDisplay).apply {
                text = "Please enter Litres per Lap"
            }
        }
        else {
            val laps = findViewById<EditText>(R.id.etLaps).text.toString().toDouble()
            val liters = findViewById<EditText>(R.id.etLiters).text.toString().toDouble()
            var lapsX = 0 + laps
            var litersX = 0 + liters
            val calc = lapsX * litersX + litersX
            val calcX = calc.roundToInt()
            val apply = findViewById<TextView>(R.id.tvDisplay).apply {
                text = calcX.toString() + " liters for " + lapsX.roundToInt() + " +1 laps."
            }
        }
    }
}