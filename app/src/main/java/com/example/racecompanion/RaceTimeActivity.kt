package com.example.racecompanion

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class RaceTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_race_time)
        val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
            text = ""
        }
    }


    fun CalculateTime(view: View) {
        val checkTimeH = findViewById<EditText>(R.id.eTRTRaceTimeHH)
        val checkTimeM = findViewById<EditText>(R.id.eTRTRaceTimeMM)
        val checkLapM = findViewById<EditText>(R.id.eTRTLapTimeMM)
        val checkLapS = findViewById<EditText>(R.id.eTRTLapTimeSS)
        val checkTLiters = findViewById<EditText>(R.id.eTRTLiters)

        if (TextUtils.isEmpty(checkTimeH.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = "Please enter Race Time (HH)"
            }
        }
        else if (TextUtils.isEmpty(checkTimeM.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = "Please enter Race Time (MM)"
            }
        }
        else if (TextUtils.isEmpty(checkLapM.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = "Please enter Lap Time (MM)"
            }
        }
        else if (TextUtils.isEmpty(checkLapS.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = "Please enter Lap Time (SS)"
            }
        }
        else if (TextUtils.isEmpty(checkTLiters.getText().toString())) {
            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = "Please enter Liters (Liters)"
            }
        }
        else {
            var rtHH = 60 * findViewById<EditText>(R.id.eTRTRaceTimeHH).text.toString().toDouble()
            var rtMM = 60 * findViewById<EditText>(R.id.eTRTRaceTimeMM).text.toString().toDouble()
            var rt = 60 * rtHH + rtMM
            var tlMM = 60 * findViewById<EditText>(R.id.eTRTLapTimeMM).text.toString().toDouble()
            val tlSS = findViewById<EditText>(R.id.eTRTLapTimeSS).text.toString().toDouble()
            var tl = tlMM + tlSS
            var fl = findViewById<EditText>(R.id.eTRTLiters).text.toString().toDouble()

            val Fuel = (rt/tl)*fl+(2*fl)
            val FuelX = Fuel.roundToInt()

            val Laps = rt / tl + 1
            val LapsX = Laps.roundToInt()

            val apply = findViewById<TextView>(R.id.tVRTDisplay).apply {
                text = FuelX.toString() + " liters for " + LapsX.toString() + " laps"
            }
        }
    }
}