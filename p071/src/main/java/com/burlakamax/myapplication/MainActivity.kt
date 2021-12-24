package com.burlakamax.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val textTitle = findViewById<TextView>(R.id.textView)
        val text = findViewById<TextView>(R.id.textView2)
        val img = findViewById<ImageView>(R.id.imageView)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.radioButton2 ->  textTitle.text = "rb1"
                R.id.radioButton4 ->  textTitle.text = "rb2"
            }
        }

        return when (item.itemId) {

            R.id.electric_guitar -> {
                textTitle.text = getString(R.string.electric_guitar)
                text.text = getString(R.string.electric_guitar1)
                img.setImageResource(R.drawable.electric_guitar)
                true
            }
            R.id.acoustic_guitar -> {
                textTitle.text = getString(R.string.acoustic_guitar)
                text.text = getString(R.string.acoustic_guitar1)
                img.setImageResource(R.drawable.acoustic_guitar)
                true
            }
            R.id.bass_guitar -> {
                textTitle.text = getString(R.string.bass_guitar)
                text.text = getString(R.string.bass_guitar1)
                img.setImageResource(R.drawable.bass_guitar)
                true
            }
            R.id.small_drum -> {
                textTitle.text = getString(R.string.small_drum)
                text.text = getString(R.string.small_drum1)
                img.setImageResource(R.drawable.small_drum)
                true
            }
            R.id.big_drum -> {
                textTitle.text = getString(R.string.big_drum)
                text.text = getString(R.string.big_drum1)
                img.setImageResource(R.drawable.big_drum)
                true
            }
            R.id.system_drum -> {
                textTitle.text = getString(R.string.system_drum)
                text.text = getString(R.string.system_drum1)
                img.setImageResource(R.drawable.system_drum)
                true
            }
            R.id.acoustic_piano -> {
                textTitle.text = (getString(R.string.acoustic_piano))
                text.text = (getString(R.string.acoustic_piano1))
                img.setImageResource(R.drawable.acoustic_piano)
                true
            }
            R.id.accordion -> {
                textTitle.text = (getString(R.string.accordion))
                text.text = (getString(R.string.accordion1))
                img.setImageResource(R.drawable.accordion)
                true
            }
            R.id.synthesizers -> {
                textTitle.text = (getString(R.string.synthesizers))
                text.text = (getString(R.string.synthesizers1))
                img.setImageResource(R.drawable.synthesizers)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}