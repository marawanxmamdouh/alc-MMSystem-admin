package com.peculiaruc.alc_mmsystem_admin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.peculiaruc.alc_mmsystem_admin.domain.models.User
import com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest.MentorProfileRequest
import com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest.UserAdapter

//import fake.`package`.name.`for`.sync.R

class MentorAppRequests : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private lateinit var userAdapter: UserAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_app_requests)

        recyclerView = findViewById(R.id.rvProgramRows)
        recyclerView.layoutManager= LinearLayoutManager(this)
        userList = ArrayList()

        userList.add(
            User(R.drawable.m1, "Jeremy Johnson", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m2, "Jane Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m3, "Roseline Anapuna", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m4, "Rose Ikemefuna", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m5, "Emmanuela Afolanya", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m6, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m7, "Chidimma Rosebud", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m8, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m9, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.m10, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )

        userAdapter = UserAdapter(userList)
        recyclerView.adapter = userAdapter



        var btn = findViewById<FloatingActionButton>(R.id.fab_add_mentor)
        btn.setOnClickListener{
            val intent = Intent(this, MentorProfileRequest::class.java)
            startActivity(intent)
        }
        var backBtn = findViewById<ImageView>(R.id.leftArrow2)
        backBtn.setOnClickListener {
            this.finish()
        }

    }

}

