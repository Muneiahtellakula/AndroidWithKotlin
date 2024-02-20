package com.example.activitylifecycles

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.txt)
        Toast.makeText(this,"App is created",Toast.LENGTH_SHORT).show()
       // textView.text="onCreate()"
        textView.append("onCreate()")
        Log.i("MainActivity","create")

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"App is started",Toast.LENGTH_SHORT).show()
        //textView.text="onStart()"
        textView.append("\nonStart()")
        Log.i("MainActivity","start")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"App is resumed",Toast.LENGTH_SHORT).show()
        //textView.text="onResume()"
        textView.append("\nonResume()")
        Log.i("MainActivity","Resume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"App is paused",Toast.LENGTH_SHORT).show()
       // textView.text="onPause()"
        textView.append("\nonPause()")
        Log.i("MainActivity","pause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"App is Stopped",Toast.LENGTH_SHORT).show()
        //textView.text="onStop()"
        textView.append("\nonStop()")
        Log.i("MainActivity","Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"App is Restarted",Toast.LENGTH_SHORT).show()
//        textView.text="onRestart()"
        textView.append("\nonReStart()")
        Log.i("MainActivity","Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"App is Destroyed",Toast.LENGTH_SHORT).show()
//        textView.text="onDestroy()"
        textView.append("\nonDestroy()")
        Log.i("MainActivity","Destroy")
    }

}