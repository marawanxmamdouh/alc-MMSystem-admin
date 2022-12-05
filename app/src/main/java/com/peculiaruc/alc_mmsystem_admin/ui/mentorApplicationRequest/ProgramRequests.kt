package com.peculiaruc.alc_mmsystem_admin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress

//import fake.`package`.name.`for`.sync.R

class ProgramRequests : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var programList: ArrayList<Program>
    private lateinit var programAdapter: ProgramAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_requests)

        recyclerView = findViewById(R.id.rvProgramRows)
        recyclerView.layoutManager= LinearLayoutManager(this)
        programList = ArrayList()

        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p1, R.drawable.pi1, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p2, R.drawable.pi2, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p3, R.drawable.pi3, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p4, R.drawable.pi1, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p5, R.drawable.pi2, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p6, R.drawable.pi3, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p7, R.drawable.pi1, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p8, R.drawable.pi2, "Google Africa Scholarship Program"))
        programList.add(Program("","", ProgramProgress.ADD ,R.drawable.p9, R.drawable.pi3, "Google Africa Scholarship Program"))



        programAdapter = ProgramAdapter(programList)
        recyclerView.adapter = programAdapter

        var backBtn = findViewById<ImageView>(R.id.leftArrow2)
        backBtn.setOnClickListener {
            this.finish()
        }


    }

}

