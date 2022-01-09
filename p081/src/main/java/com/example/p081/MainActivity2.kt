package com.example.p081

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)

        val messageName = editText.text.toString()

        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", messageName)
            startActivity(intent)
        }
    }
}