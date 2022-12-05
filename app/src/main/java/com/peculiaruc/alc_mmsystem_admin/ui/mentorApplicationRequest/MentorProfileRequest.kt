package com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.peculiaruc.alc_mmsystem_admin.R


class MentorProfileRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile_request)


        var backBtn = findViewById<ImageView>(R.id.leftArrow2)
        backBtn.setOnClickListener {
            this.finish()
        }
        var chatBtn = findViewById<ImageView>(R.id.imageView)
        chatBtn.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
            startActivity(intent)
        }
    }
}