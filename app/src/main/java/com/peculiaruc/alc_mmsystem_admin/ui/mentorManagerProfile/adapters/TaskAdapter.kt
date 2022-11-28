package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * task adapter class for the Mentor Manger Profile fragment
 */
class TaskAdapter(
    items: List<Task>,
    listener: TaskInteractionListener
) : BaseAdapter<Task>(items, listener) {
    override val layoutID: Int = R.layout.item_task
}

/**
 * task interaction listener for the Mentor Manger Profile fragment
 */
interface TaskInteractionListener : BaseInteractionListener {
    /**
     * done when the task item is clicked
     */
    fun onItemTaskSelected(item: Task)
}