package com.example.downladimage

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class DownloadImage(val image: ImageView):
        AsyncTask<String,Void,Bitmap>(){
    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun doInBackground(vararg params: String?):
            Bitmap? {
        val url = params[0] // "string url"

        try {
            val urlObjects : URL = URL(url)

            val connection = urlObjects.openConnection()
            as HttpURLConnection
            connection.connect()

            val input : InputStream = connection.inputStream

            val bitmap = BitmapFactory.decodeStream(input)

            return bitmap

        }catch (e:Exception){

        }
        return null
    }

    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)
        image.setImageBitmap(result)
    }

}