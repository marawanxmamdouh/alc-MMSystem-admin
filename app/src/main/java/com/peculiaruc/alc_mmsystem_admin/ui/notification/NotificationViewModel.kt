package com.peculiaruc.alc_mmsystem_admin.ui.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Notification
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event


/**
 * this is the viewModel for Notification.
 */
class NotificationViewModel : ViewModel(), NotificationInteractionListener {

    private val _selectNotificationEvent = MutableLiveData<Event<Boolean>>()
    val selectNotificationEvent: LiveData<Event<Boolean>> = _selectNotificationEvent

    private val _notifications = MutableLiveData<List<Notification>>()
    val notifications: LiveData<List<Notification>> = _notifications


    init {
        _notifications.postValue(testNotification())
    }

    override fun onNotificationClick(item: Notification) {
        _selectNotificationEvent.postValue(Event(true))
    }

    /**
     * done when clicked on button mark as read.
     */
    fun onClickMarkAllAsRead() {
        _notifications.postValue(emptyList())
    }

    //function for test only .
    private fun testNotification(): List<Notification> {
        return listOf(
            Notification(
                "",
                "Monday at 11:52 PM",
                "Lex Murphy",
                " requested approval for Gads Certificate  by",
                "Roseline Anapuna"
            )
        )
    }
}