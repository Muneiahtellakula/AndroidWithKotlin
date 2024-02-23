package com.example.workingwithapis

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(val list:List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(itemView:View)
        :RecyclerView.ViewHolder(itemView) {
            val id = itemView.
            findViewById<TextView>(R.id.id)
            val name = itemView.
            findViewById<TextView>(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = list[position].Make_Id
        holder.name.text = list[position].Make_Name
    }
}