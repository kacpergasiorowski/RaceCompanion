package com.example.racecompanion

import android.annotation.SuppressLint
import android.content.Intent
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
    }
    fun LapsCalculator(view: View){
        startActivity(Intent(this, RaceLapsActivity::class.java)).apply {
        }
    }
    fun TimeCalculator(view: View){
        startActivity(Intent(this, RaceTimeActivity::class.java)).apply {
        }
    }
}