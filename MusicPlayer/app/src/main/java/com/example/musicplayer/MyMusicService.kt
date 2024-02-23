package com.example.musicplayer

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyMusicService : Service() {
     lateinit var mediaPlayer: MediaPlayer
    override fun onCreate() {
        super.onCreate()
        mediaPlayer= MediaPlayer.create(this,
            R.raw.annamcharya)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer.start()
        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        mediaPlayer.stop()
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}