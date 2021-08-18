package org.techtown.sungshin3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

import org.techtown.sungshin3f.databinding.ActivityYoutubeplayerBinding

class Youtubeplayer : AppCompatActivity() {
    var player: YouTubePlayer?=null
    var videoCode:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityYoutubeplayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playerView.addYouTubePlayerListener(object: AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                println("onReady 호출됨")
                player = youTubePlayer
                processIntent(intent)
                println(videoCode)
                player?.cueVideo(videoCode!!, 0f)
                player?.play()
            }

        })

    }
    fun processIntent(passedIntent: Intent){
        println("processIntent")
        videoCode=passedIntent.getStringExtra("video")
    }

}