package com.dixitech.myrecy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    lateinit var itemViewModel: List<ItemViewModel>
val data = ArrayList<ItemViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.rec)
        populateData()
        /*var name="Item"
        for(i in 1..20){
            data.add(ItemViewModel(R.drawable.ic_launcher_foreground,i))
        }*/
    recyclerView.adapter=ReAdapter(data)
        recyclerView.layoutManager=LinearLayoutManager(this)

    }

    private fun populateData() {
        data.add(ItemViewModel(R.drawable.cutedog,1))
        data.add(ItemViewModel(R.drawable.rat,2))
        data.add(ItemViewModel(R.drawable.cutedog,3))
        data.add(ItemViewModel(R.drawable.rat,4))
        data.add(ItemViewModel(R.drawable.cutedog,5))
        data.add(ItemViewModel(R.drawable.rat,6))
        data.add(ItemViewModel(R.drawable.cutedog,7))
        data.add(ItemViewModel(R.drawable.rat,8))
        data.add(ItemViewModel(R.drawable.cutedog,9))
        data.add(ItemViewModel(R.drawable.rat,10))
        data.add(ItemViewModel(R.drawable.cutedog,11))
        data.add(ItemViewModel(R.drawable.rat,12))
        data.add(ItemViewModel(R.drawable.cutedog,13))
        data.add(ItemViewModel(R.drawable.rat,14))
        data.add(ItemViewModel(R.drawable.cutedog,15))
        data.add(ItemViewModel(R.drawable.rat,16))
        data.add(ItemViewModel(R.drawable.cutedog,17))
    }


}