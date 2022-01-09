package com.example.p091

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.p091.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        lateinit var binding: ActivityMainBinding
         var adapter = InstrumentsAdapter()
         val imgList = listOf(
            R.drawable.accordion,
            R.drawable.acoustic_guitar,
            R.drawable.acoustic_piano,
            R.drawable.bass_guitar,
            R.drawable.big_drum,
            R.drawable.electric_guitar,
            R.drawable.small_drum,
            R.drawable.synthesizers,
            R.drawable.system_drum
        )
        val textTitle = listOf(
            R.string.accordion,
            R.string.acoustic_guitar,
            R.string.acoustic_piano,
            R.string.bass_guitar,
            R.string.big_drum,
            R.string.electric_guitar,
            R.string.small_drum,
            R.string.synthesizers,
            R.string.system_drum
        )
       var index = 0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            binding = ActivityMainBinding.inflate(layoutInflater)
            init()
        }

        fun init() = with(binding) {
            rcViev.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcViev.adapter = adapter
            button3.setOnClickListener {
                if (index > 8) index = 0
                val instr = Instrument(imgList[index], textTitle[index].toString())
                adapter.instList(instr)
                index++
            }
        }
    }
}