package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * Mentor adapter class for the Mentor Manger Profile fragment
 */
class MentorAdapter(items: List<Mentor>, listener: MentorInteractionListener) :
    BaseAdapter<Mentor>(items, listener) {
    override val layoutID: Int = R.layout.item_mentor
}

/**
 * Mentor interaction listener for the Mentor Manger Profile fragment
 */
interface MentorInteractionListener : BaseInteractionListener {
    /**
     * done when the Mentor item is clicked
     */
    fun onItemMentorSelected(item: Mentor)
}