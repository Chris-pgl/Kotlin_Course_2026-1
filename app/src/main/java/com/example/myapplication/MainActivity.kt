package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnC)
        val txt = findViewById<TextView>(R.id.txtK)
        val txtR = findViewById<TextView>(R.id.textR)

        btn.setOnClickListener {
            val kilos = txt.text.toString().toDoubleOrNull()

            if(kilos != null){
                val pound = makeConvert(kilos)
                txtR.text = pound.roundToInt().toString()
            }else{
                txtR.text = "0"
            }
        }
    }

    fun  makeConvert(kilos: Double): Double{
        return kilos * 2.20462
    }
}
