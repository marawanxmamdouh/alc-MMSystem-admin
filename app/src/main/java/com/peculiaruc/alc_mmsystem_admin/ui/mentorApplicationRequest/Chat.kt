package com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.peculiaruc.alc_mmsystem_admin.R

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        var backBtn = findViewById<ImageView>(R.id.leftArrow3)
        backBtn.setOnClickListener {
            this.finish()
        }
    }
}