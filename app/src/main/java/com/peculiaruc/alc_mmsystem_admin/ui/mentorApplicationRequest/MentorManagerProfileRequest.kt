package com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.peculiaruc.alc_mmsystem_admin.R


class MentorManagerProfileRequest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_manager_profile_request)


        var backBtn = findViewById<ImageView>(R.id.leftArrow2)
        backBtn.setOnClickListener {
            this.finish()
        }
        var chatBtn = findViewById<ImageView>(R.id.chatIcon)
        chatBtn.setOnClickListener {
            this.finish()
        }
    }
}