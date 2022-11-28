package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * Program adapter class for the Mentor Manger Profile fragment
 */
class ProgramAdapter(items: List<Program>, listener: ProgramInteractionListener) :
    BaseAdapter<Program>(items, listener) {
    override val layoutID: Int = R.layout.item_program
}

/**
 * Program interaction listener for the Mentor Manger Profile fragment
 */
interface ProgramInteractionListener : BaseInteractionListener {

    /**
     * done when the Program item is clicked
     */
    fun onProgramSelected(item: Program)
}