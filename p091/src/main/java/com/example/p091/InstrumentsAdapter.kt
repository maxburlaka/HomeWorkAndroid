package com.example.p091

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.p091.databinding.InstrumentsItemBinding
import java.util.ArrayList

class InstrumentsAdapter: RecyclerView.Adapter<InstrumentsAdapter.InstHolder>() {
    val instList = ArrayList<Instrument>()

    class InstHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = InstrumentsItemBinding.bind(item)
        fun instruments(instrument: Instrument) = with(binding) {
            imageView.setImageResource(instrument.imgId)
            textView.text = instrument.textTitle
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.instruments_item, parent, false)
        return InstHolder(view)
    }

    override fun onBindViewHolder(holder: InstHolder, position: Int) {
        holder.instruments(instList[position])
    }

    override fun getItemCount(): Int {
        return instList.size
    }

    fun instList(instr: Instrument) {
        instList.add(instr)
    }

}