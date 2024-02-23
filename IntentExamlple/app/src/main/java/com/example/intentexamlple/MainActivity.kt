package com.example.intentexamlple

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var firstButton: Button
    lateinit var secondButton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton = findViewById(R.id.implicitBtn)
        secondButton = findViewById(R.id.explicitBtn)

        firstButton.setOnClickListener {
            var url = Uri.parse(
                "https://www.google.com")
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(url)
            startActivity(i)

        }
        secondButton.setOnClickListener {
           val i = Intent(this,
               SecondAcitivity::class.java)
            startActivity(i)
        }

    }
}