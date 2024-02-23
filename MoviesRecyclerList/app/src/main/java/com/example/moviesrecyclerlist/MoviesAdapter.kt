package com.example.moviesrecyclerlist

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(var list: ArrayList<MovieData>) :RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var img: ImageView = itemView.findViewById(R.id.movieposter_img)
        var textview_moviename: TextView = itemView.findViewById(R.id.movie_title)
        var textview_dirname: TextView = itemView.findViewById(R.id.movie_dirname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(
            R.layout.single_row, parent, false
        )
        return MyViewHolder(View)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,                                   position: Int) {
        var data = list[position]
        holder.textview_dirname.text=
            data.dirName
        holder.textview_moviename.text=
            data.movieName
        holder.img.setImageResource(list[position]
            .moviePoster)
    }


}