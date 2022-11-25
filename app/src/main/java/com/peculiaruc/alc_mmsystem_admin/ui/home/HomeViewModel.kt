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

    fun onNotificationClick() {
        _notificationEvent.postValue(Event(true))
    }

    fun openDrawer() {
        _drawerEvent.postValue(Event(true))
    }

    fun onViewMMClick() {
        _viewMMEvent.postValue(Event(true))
    }

    fun onViewMentorsClick() {
        _viewMentorsEvent.postValue(Event(true))
    }

    fun onViewProgramsClick() {
        _viewProgramsEvent.postValue(Event(true))
    }
}