package com.example.p081

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val textName = findViewById<TextView>(R.id.textView2)
        val textCountry = findViewById<TextView>(R.id.textView5)

        textName.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val intent1 = getIntent()
            val messageName = intent1.getStringExtra("name")
            if (messageName != null){
                textName.text = messageName
            }
            startActivity(intent)
        }

        textCountry.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val intent1 = getIntent()
            val messageCountry = intent1.getStringExtra("country")
            if (messageCountry != null){
                textName.text = messageCountry
            }
            startActivity(intent)
        }

        imageView.setOnClickListener {
            getImage()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && data != null){
            if(requestCode == RESULT_OK){

            }
        }
    }

    private fun getImage() {
        val intentChooser = Intent()
        intentChooser.type = "image/*"
        intentChooser.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intentChooser, 1)
    }
}