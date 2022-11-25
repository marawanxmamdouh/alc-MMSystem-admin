package com.peculiaruc.alc_mmsystem_admin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.peculiaruc.alc_mmsystem_admin.domain.models.User
import com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest.MentorManagerProfileRequest
import com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest.UserAdapter

//import fake.`package`.name.`for`.sync.R

class MentorManagerAppRequests : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private lateinit var userAdapter: UserAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mm_app_requests)

        recyclerView = findViewById(R.id.rvProgramRows)
        recyclerView.layoutManager= LinearLayoutManager(this)
        userList = ArrayList()

        userList.add(
            User(R.drawable.mm1, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm2, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm3, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm4, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm5, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm6, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )
        userList.add(
            User(R.drawable.mm7, "Peculiar C. Umeh", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS")
        )


        userAdapter = UserAdapter(userList)
        recyclerView.adapter = userAdapter

        var btn = findViewById<FloatingActionButton>(R.id.fab_add_mentor)
        btn.setOnClickListener{
            val intent = Intent(this, Add_Mentor_Manager_Application_Dialog::class.java)
            startActivity(intent)
        }
        var backBtn = findViewById<ImageView>(R.id.leftArrow2)
        backBtn.setOnClickListener {
            this.finish()
        }
//        val view = LayoutInflater.from(recyclerView.context).inflate(R.layout.item_user, recyclerView, false)
//        view.setOnClickListener {
//            val intent = Intent(recyclerView.context, MentorManagerProfileRequest::class.java)
//            recyclerView.context.startActivity(intent)
//        }











    }

}

