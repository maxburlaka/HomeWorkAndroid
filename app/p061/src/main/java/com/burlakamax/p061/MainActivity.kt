package com.burlakamax.p061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text0neTeam = findViewById(R.id.textView3) as TextView
        var textTwoTeam = findViewById(R.id.textView4) as TextView
        var buttonOnePoints = findViewById(R.id.p1) as Button
        var buttonTwoPoints = findViewById(R.id.p2) as Button
        var buttonTrePoints = findViewById(R.id.p3) as Button
        var buttonOnePoints1 = findViewById(R.id.p11) as Button
        var buttonTwoPoints1 = findViewById(R.id.p22) as Button
        var buttonTrePoints1 = findViewById(R.id.p33) as Button
        var buttonReset = findViewById(R.id.reset) as Button
        var s1 = 0
        var s2 = 0

        buttonOnePoints.setOnClickListener{
            s1 = s1 + 1
            text0neTeam.setText("$s1")
        }

        buttonTwoPoints.setOnClickListener {
            s1 = s1 + 2
            text0neTeam.setText("$s1")
        }

        buttonTrePoints.setOnClickListener {
            s1 = s1 + 3
            text0neTeam.setText("$s1")
        }

        buttonOnePoints1.setOnClickListener{
            s2 = s2 + 1
            textTwoTeam.setText("$s2")
        }

        buttonTwoPoints1.setOnClickListener {
            s2 = s2 + 2
            textTwoTeam.setText("$s2")
        }

        buttonTrePoints1.setOnClickListener {
            s2 = s2 + 3
            textTwoTeam.setText("$s2")
        }

        buttonReset.setOnClickListener {
            s1 = 0
            s2 = 0
            text0neTeam.setText("$s1")
            textTwoTeam.setText("$s2")
        }
    }
}