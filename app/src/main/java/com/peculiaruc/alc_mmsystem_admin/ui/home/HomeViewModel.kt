package com.peculiaruc.alc_mmsystem_admin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class HomeViewModel : ViewModel() {

    private val _notificationEvent = MutableLiveData<Event<Boolean>>()
    val notificationEvent: LiveData<Event<Boolean>> = _notificationEvent

    private val _drawerEvent = MutableLiveData<Event<Boolean>>()
    val drawerEvent: LiveData<Event<Boolean>> = _drawerEvent

    private val _viewMMEvent = MutableLiveData<Event<Boolean>>()
    val viewMMEvent: LiveData<Event<Boolean>> = _viewMMEvent

    private val _viewMentorsEvent = MutableLiveData<Event<Boolean>>()
    val viewMentorsEvent: LiveData<Event<Boolean>> = _viewMentorsEvent

    private val _viewProgramsEvent = MutableLiveData<Event<Boolean>>()
    val viewProgramsEvent: LiveData<Event<Boolean>> = _viewProgramsEvent

    private val _createTaskEvent = MutableLiveData<Event<Boolean>>()
    val createTaskEvent: LiveData<Event<Boolean>> = _createTaskEvent

    private val _sentBroadcastEvent = MutableLiveData<Event<Boolean>>()
    val sentBroadcastEvent: LiveData<Event<Boolean>> = _sentBroadcastEvent

    private val _addMentorManagerEvent = MutableLiveData<Event<Boolean>>()
    val addMentorManagerEvent: LiveData<Event<Boolean>> = _addMentorManagerEvent

    private val _addMentorEvent = MutableLiveData<Event<Boolean>>()
    val addMentorEvent: LiveData<Event<Boolean>> = _addMentorEvent

    /**
     * set event when user click on notification
     * */
    fun onNotificationClick() {
        _notificationEvent.postValue(Event(true))
    }

    /**
     * set event to open start drawer.
     * */
    fun openDrawer() {
        _drawerEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Mentor Manger.
     * */
    fun onViewMMClick() {
        _viewMMEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Mentor.
     * */
    fun onViewMentorsClick() {
        _viewMentorsEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Program.
     * */
    fun onViewProgramsClick() {
        _viewProgramsEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Task.
     * */
    fun onCreateTaskClick() {
        _createTaskEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Broadcast.
     * */
    fun onSentBroadcastClick() {
        _sentBroadcastEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Add to new add mentor mange .
     * */
    fun onAddMentorManagerClick() {
        _addMentorManagerEvent.postValue(Event(true))
    }

    /**
     * set event when user click on Add to add Mentor.
     * */
    fun onAddMentorClick() {
        _addMentorEvent.postValue(Event(true))
    }
}