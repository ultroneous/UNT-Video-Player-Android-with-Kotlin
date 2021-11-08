package com.unt.videoplayer

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class OfflineVideoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.offlinevideo_activity)

        var VideoView = findViewById<VideoView>(R.id.offPlayer)

        //Setting MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(VideoView)

        //Setting video path in the URI
        val uri: Uri =
            parse("android.resource://" + getPackageName() + "/" + R.raw.beens) //copy Video in raw folder

        //Setting MediaController and URI, then starting the videoView
        VideoView.setMediaController(mediaController)
        VideoView.setVideoURI(uri)
        VideoView.requestFocus()
        VideoView.start()
    }
}