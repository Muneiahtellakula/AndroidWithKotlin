package com.example.moviesrecyclerlist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<MovieData>
    lateinit var adapter:MoviesAdapter

    lateinit var recyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.rec)
        populateData()
        adapter= MoviesAdapter(list)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
    private fun populateData() {
        list= ArrayList<MovieData>()
        list.add(MovieData("AA", "3Vikram",R.drawable.aajpg))
        list.add(MovieData("BhaluBali", "RajMouli",R.drawable.bhalubali))
        list.add(MovieData("Chandramuki", "LAkaka",R.drawable.chandramuki))
        list.add(MovieData("Darling", "Karnakar",R.drawable.darling))
        list.add(MovieData("Egal", "Karthik",R.drawable.egal))
        list.add(MovieData("FulakNama", "",R.drawable.fulaknamdas))
        list.add(MovieData("Hanuman", "Prasanth",R.drawable.hanuman))
        list.add(MovieData("Charlee", "Charlle",R.drawable.cutedog))
    }
}