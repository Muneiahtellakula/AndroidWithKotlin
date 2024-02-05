package com.dixitech.myrecy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ReAdapter(private val mList: ArrayList<ItemViewModel>) : RecyclerView.Adapter<ReAdapter.MyViewHold>() {
lateinit var itemViewModel: ItemViewModel

    class MyViewHold(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: ImageView = itemView.findViewById(R.id.img)
        val idd: TextView = itemView.findViewById(R.id.img_dec)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReAdapter.MyViewHold {
        return MyViewHold(LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false))
    }

    override fun onBindViewHolder(holder: ReAdapter.MyViewHold, position: Int) {
        val item=mList[position]
        holder.name.setImageResource(item.name)

        holder.idd.text=item.idd.toString()
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}