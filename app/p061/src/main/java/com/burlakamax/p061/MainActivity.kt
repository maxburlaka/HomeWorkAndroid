package com.burlakamax.p061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text0neTeam = findViewById<TextView>(R.id.textView3)
        val textTwoTeam = findViewById<TextView>(R.id.textView4)
        val buttonOnePoints = findViewById<Button>(R.id.p1)
        val buttonTwoPoints = findViewById<Button>(R.id.p2)
        val buttonTrePoints = findViewById<Button>(R.id.p3)
        val buttonOnePoints1 = findViewById<Button>(R.id.p11)
        val buttonTwoPoints1 = findViewById<Button>(R.id.p22)
        val buttonTrePoints1 = findViewById<Button>(R.id.p33)
        val buttonReset = findViewById<Button>(R.id.reset)
        var s1 = 0
        var s2 = 0

        buttonOnePoints.setOnClickListener{
            s1 = s1 + 1
            text0neTeam.text = s1.toString()
        }

        buttonTwoPoints.setOnClickListener {
            s1 = s1 + 2
            text0neTeam.text = s1.toString()
        }

        buttonTrePoints.setOnClickListener {
            s1 = s1 + 3
            text0neTeam.text = s1.toString()
        }

        buttonOnePoints1.setOnClickListener{
            s2 = s2 + 1
            textTwoTeam.text = s2.toString()
        }

        buttonTwoPoints1.setOnClickListener {
            s2 = s2 + 2
            textTwoTeam.text = s2.toString()
        }

        buttonTrePoints1.setOnClickListener {
            s2 = s2 + 3
            textTwoTeam.text = s2.toString()
        }

        buttonReset.setOnClickListener {
            s1 = 0
            s2 = 0
            text0neTeam.text = s1.toString()
            textTwoTeam.text = s2.toString()
        }
    }
}