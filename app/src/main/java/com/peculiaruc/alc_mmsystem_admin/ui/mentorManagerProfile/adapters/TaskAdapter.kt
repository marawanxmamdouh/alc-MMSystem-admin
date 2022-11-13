package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class TaskAdapter(
    items: List<Task>,
    listener: TaskInteractionListener
) : BaseAdapter<Task>(items, listener) {
    override val layoutID: Int = R.layout.item_task
}

interface TaskInteractionListener : BaseInteractionListener {
    fun onItemTaskSelected(item: Task)
}