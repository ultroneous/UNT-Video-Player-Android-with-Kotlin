package com.unt.videoplayer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        //Online Button
        val onButton = findViewById<Button>(R.id.OnBtn)
        onButton.setOnClickListener{
            val intent = Intent(this,OnlineVideoActivity::class.java)
            startActivity(intent)
        }

        //Offline Button
        val offButton = findViewById<Button>(R.id.OffBtn)
        offButton.setOnClickListener{
            val intent = Intent(this,OfflineVideoActivity::class.java)
            startActivity(intent)
        }

    }
}