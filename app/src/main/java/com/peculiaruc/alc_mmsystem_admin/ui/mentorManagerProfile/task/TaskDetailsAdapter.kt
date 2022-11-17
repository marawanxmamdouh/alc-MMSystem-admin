package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.task

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.TaskDetails
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class TaskDetailsAdapter(
    items: List<TaskDetails>,
    listener: TaskDetailInteractionListener
) : BaseAdapter<TaskDetails>(items, listener) {
    override val layoutID: Int = R.layout.item_task_details
}

interface TaskDetailInteractionListener : BaseInteractionListener {
    fun onTaskDetailsView(item: TaskDetails)
}