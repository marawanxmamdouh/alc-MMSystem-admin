package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.TaskDetails
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class TaskViewModel : ViewModel(), TaskDetailInteractionListener {

    private val _assignToTaskEvent = MutableLiveData<Event<Boolean>>()
    val assignToTaskEvent: LiveData<Event<Boolean>> = _assignToTaskEvent

    private val _viewTaskEvent = MutableLiveData<Event<TaskDetails>>()
    val viewTaskEvent: LiveData<Event<TaskDetails>> = _viewTaskEvent

    override fun onTaskDetailsView(item: TaskDetails) {
        _viewTaskEvent.postValue(Event(item))
    }

    fun onClickAssignToTask() {
        _assignToTaskEvent.postValue(Event(true))
    }
}