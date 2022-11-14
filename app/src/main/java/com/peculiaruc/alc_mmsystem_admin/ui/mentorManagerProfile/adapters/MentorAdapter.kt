package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class MentorAdapter(items: List<Mentor>, listener: MentorInteractionListener) :
    BaseAdapter<Mentor>(items, listener) {
    override val layoutID: Int = R.layout.item_mentor
}

interface MentorInteractionListener : BaseInteractionListener {
    fun onItemMentorSelected(item: Mentor)
}