package org.techtown.sungshin3f

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import org.json.JSONObject
import org.techtown.sungshin3f.databinding.ActivityInfood2VeganBinding
import java.lang.Exception
import java.net.URL

class Infood2Vegan : AppCompatActivity() {
    private var mBinding: ActivityInfood2VeganBinding?=null
    private val binding get()=mBinding!!
    val adapter4=InFoodAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityInfood2VeganBinding.inflate(layoutInflater)
        setContentView(binding.root)

        VeganyoutubeTask().execute()

        var layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.RecyclerView.layoutManager=layoutManager
    }
    inner class VeganyoutubeTask(): AsyncTask<String, Void, String>(){

        override fun onPreExecute() {
            println("onPreExcute()")
            super.onPreExecute()
        }

        override fun doInBackground(vararg params: String?): String? {
            println("doInBackground()")
            var response:String?
            try{
                response= URL("https://www.googleapis.com/youtube/v3/search?key=AIzaSyAAg2lwJgMXs_PafWXuBR0mUyprkfIc8GQ&q=%EB%B9%84%EA%B1%B4%EC%9A%94%EB%A6%AC&type=video&regionCode=KR&videoDuration=short&part=snippet")
                    .readText(Charsets.UTF_8)
            }catch (e: Exception){
                response=null
            }
            return response
        }

        override fun onPostExecute(result:String?){
            super.onPostExecute(result)
            println("onPostExecute()")
            val jsonObject= JSONObject(result)
            val jsonArray=jsonObject.getJSONArray("items")

            for(i in 0..jsonArray.length()-1){
                val iObject=jsonArray.getJSONObject(i)

                //타이틀 가져오기
                val snippet=iObject.getJSONObject("snippet")
                val title=snippet.getString("title")

                //비디오 url가져오기
                val id=iObject.getJSONObject("id")
                val videoId=id.getString("videoId")

                //썸네일 가져오기
                val thumbnails=snippet.getJSONObject("thumbnails")
                val medium=thumbnails.getJSONObject("medium")
                val url=medium.getString("url")

                adapter4.items.add(Food("${title}","${videoId}","${url}"))
            }
            binding.RecyclerView.adapter=adapter4
        }
    }
}