package com.peculiaruc.alc_mmsystem_admin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program

//import fake.`package`.name.`for`.sync.R

class ProgramAdapter(private val programList: ArrayList<Program>): RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder>() {


    class ProgramViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val image_program: ImageView = itemView.findViewById(R.id.image_program)
        val image_progress: ImageView = itemView.findViewById(R.id.image_progress)
        val text_title: TextView = itemView.findViewById(R.id.text_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_program_request, parent, false)
        return ProgramViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        val program = programList[position]
        holder.image_program.setImageResource(program.image_program)
        holder.image_progress.setImageResource(program.image_progress)
        holder.text_title.text = program.text_title

    }

    override fun getItemCount(): Int {
        return programList.size
    }
}