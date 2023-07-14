package edu.mx.unipolidgo.ytplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class MainActivity : AppCompatActivity() {

    lateinit var youtubePlayerView: YouTubePlayerView

    // on below line we are creating a
    // string variable for our video id.
    var videoID = "vG2PNdI8axo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // on below line we are hiding our action bar
        actionBar?.hide()

        // on below line we are initializing
        // our youtube player view with its id.
        youtubePlayerView = findViewById(R.id.youTubePlayerView)

        // on below line we are setting full
        // screen for our youtube player view.
        youtubePlayerView.enableAutomaticInitialization



        // on below line we are getting observer
        // for our youtube player view.
        lifecycle.addObserver(youtubePlayerView)

        // on below line we are getting
        // youtube player controller ui.
        youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                super.onReady(youTubePlayer)
                youTubePlayer.loadVideo(videoID, 0f)
            }

            override fun onStateChange(
                youTubePlayer: YouTubePlayer,
                state: PlayerConstants.PlayerState
            ) {
                super.onStateChange(youTubePlayer, state)
            }
        })

        // on below line we are
        // entering it to full screen.



    }
}