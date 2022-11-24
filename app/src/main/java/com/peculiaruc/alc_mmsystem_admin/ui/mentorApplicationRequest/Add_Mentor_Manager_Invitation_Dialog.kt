package com.peculiaruc.alc_mmsystem_admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Add_Mentor_Manager_Invitation_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_add_mentor_manager_invitation)
        var doneBtn = findViewById<Button>(R.id.Done_button)
        doneBtn.setOnClickListener {
            this.finish()
        }
    }
}