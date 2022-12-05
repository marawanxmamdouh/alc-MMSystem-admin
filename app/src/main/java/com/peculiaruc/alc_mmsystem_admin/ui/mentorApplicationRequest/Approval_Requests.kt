package com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.peculiaruc.alc_mmsystem_admin.MentorAppRequests
import com.peculiaruc.alc_mmsystem_admin.MentorManagerAppRequests
import com.peculiaruc.alc_mmsystem_admin.ProgramRequests
import com.peculiaruc.alc_mmsystem_admin.R

class Approval_Requests : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_approval_requests)

        var btn1 = findViewById<Button>(R.id.view1Button)

        btn1.setOnClickListener{
            val intent = Intent(this, MentorManagerAppRequests::class.java)
            startActivity(intent)
        }

        var btn2 = findViewById<Button>(R.id.view2Button)
        btn2.setOnClickListener{
            val intent = Intent(this, MentorAppRequests::class.java)
            startActivity(intent)
        }
        var btn3 = findViewById<Button>(R.id.view3Button)
        btn3.setOnClickListener{
            val intent = Intent(this, ProgramRequests::class.java)
            startActivity(intent)


        }
        var backBtn = findViewById<ImageView>(R.id.leftArrow)
        backBtn.setOnClickListener {
            this.finish()
        }

    }
}