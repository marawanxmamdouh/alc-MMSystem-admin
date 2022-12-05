package com.peculiaruc.alc_mmsystem_admin.ui.mentorApplicationRequest

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.User
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

//import fake.`package`.name.`for`.sync.R


class UserAdapter(private val userList: ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {




    class UserViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val image_mentor: ImageView = itemView.findViewById(R.id.imageView13)
        val text_mentor_name: TextView = itemView.findViewById(R.id.franka_kebe)
        val text_role: TextView = itemView.findViewById(R.id.program_ass)
        val text_tag: TextView = itemView.findViewById(R.id.program_ass2)
        val text_tag2: TextView = itemView.findViewById(R.id.mentor_gad)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.image_mentor.setImageResource(user.image)
        holder.text_mentor_name.text = user.userName
        holder.text_role.text = user.programAssistant
        holder.text_tag.text = user.rectangleProgramAsst
        holder.text_tag2.text = user.rectangleMentor
    }

    override fun getItemCount(): Int {
        return userList.size
    }


}
interface UserInteractionListener : BaseInteractionListener {
    fun onUserSelected(item: User)



}

