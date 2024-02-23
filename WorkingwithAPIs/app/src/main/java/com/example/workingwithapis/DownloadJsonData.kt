package com.example.workingwithapis

import android.content.Context
import android.os.AsyncTask
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class DownloadJsonData(val textView: RecyclerView,
                       val context:Context)
    :AsyncTask<String,Void,String>() {

    override fun
            doInBackground(vararg params: String?): String? {
        val url = params[0]
        try {
            val urlObject = URL(url).openConnection() as
                    HttpURLConnection
            urlObject.connect()
            val inputStream=urlObject.inputStream

            val buffer = BufferedReader(
                InputStreamReader(inputStream))
            val stringBuilder= StringBuilder()
            var line:String?
            while (buffer.readLine().also { line=it }!=null)
            {
                stringBuilder.append(line)
            }
            return stringBuilder.toString()

        }catch (e:Exception){
            return null
        }
        return null
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)

        var list = arrayListOf<Car>()
        try {
            val root = JSONObject(result)
            val array = root.getJSONArray("Results")

            for (i in 0..array.length()){
                val index = array.getJSONObject(i)
                val makeId = index.optString("Make_ID")
                val makeName = index.optString("Make_Name")

                list.add(Car(makeId,makeName))
            }
        }catch (e:Exception){

        }

        textView.layoutManager =
            LinearLayoutManager(context)
        textView.addItemDecoration(DividerItemDecoration(
            context,LinearLayoutManager.VERTICAL))
        textView.adapter = CarAdapter(list)

    }


}