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

    fun onNotificationClick() {
        _notificationEvent.postValue(Event(true))
    }

    fun openDrawer() {
        _drawerEvent.postValue(Event(true))
    }
}