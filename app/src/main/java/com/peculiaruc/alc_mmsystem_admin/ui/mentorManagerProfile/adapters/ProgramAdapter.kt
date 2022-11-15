package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class ProgramAdapter(items: List<Program>, listener: ProgramInteractionListener) :
    BaseAdapter<Program>(items, listener) {
    override val layoutID: Int = R.layout.item_program
}

interface ProgramInteractionListener : BaseInteractionListener {
    fun onProgramSelected(item: Program)
}