package com.peculiaruc.alc_mmsystem_admin.ui.mentorManger

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * MentorManger  adapter class for the Mentor Manger details fragment
 */
class MentorMangerAdapter(items: List<Mentor>, listener: MentorMangerInteractionListener) :
    BaseAdapter<Mentor>(items, listener) {
    override val layoutID: Int = R.layout.item_mentor_manger
}

/**
 * MentorManger  interaction listener for the Mentor Manger fragment
 */
interface MentorMangerInteractionListener : BaseInteractionListener {
    /**
     * done when the MentorManger item is viewed
     */
    fun onItemMentorMangerSelected(item: Mentor)
}