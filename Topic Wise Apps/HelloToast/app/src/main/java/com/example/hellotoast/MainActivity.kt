package com.example.hellotoast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count=0
    lateinit var textView: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.tv)
        if (savedInstanceState !=null && savedInstanceState.containsKey("mykey"))
        {
            count=savedInstanceState.getInt("mykey")
            textView.text=count.toString()
        }

    }

    fun show_Toast_Msg(view: View) {
        Toast.makeText(this,"Your count is $count",Toast.LENGTH_SHORT).show()
    }
    fun increaseCount(view: View) {
        count++
        textView.text= count.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("mykey",count)
    }
}