package com.peculiaruc.alc_mmsystem_admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Delete_Mentor_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_add_mentor)
        var btn = findViewById<Button>(R.id.done_button)
        btn.setOnClickListener{
            val intent = Intent(this, Add_Mentor_Invitation_Dialog::class.java)
            startActivity(intent)
        }
        var cancelbtn = findViewById<Button>(R.id.undo_button)
        cancelbtn.setOnClickListener {
            this.finish()
        }
    }

}