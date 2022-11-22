package com.peculiaruc.alc_mmsystem_admin.ui.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Notification
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class NotificationViewModel : ViewModel(), NotificationInteractionListener {

    private val _selectNotificationEvent = MutableLiveData<Event<Boolean>>()
    val selectNotificationEvent: LiveData<Event<Boolean>> = _selectNotificationEvent

    override fun onNotificationClick(item: Notification) {
        _selectNotificationEvent.postValue(Event(true))
    }
}