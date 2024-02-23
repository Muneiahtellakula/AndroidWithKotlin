package com.example.musicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    var btn=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    imageView=findViewById(R.id.imageView)
        imageView.setOnClickListener(View.OnClickListener {

            if (btn==true){
                imageView.setImageResource(R.drawable.stop)
                val intent=Intent(this,
                    MyMusicService::class.java)
                startService(intent)
                btn=false

            }else{
                imageView.setImageResource(R.drawable.play)
                val intent=Intent(this,
                    MyMusicService::class.java)
                stopService(intent)
                btn=true
            }
        })
    }
}