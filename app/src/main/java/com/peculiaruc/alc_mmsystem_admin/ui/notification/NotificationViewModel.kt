package com.peculiaruc.alc_mmsystem_admin.ui.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Notification
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

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


    fun onClickMarkAllAsRead() {
        _notifications.postValue(emptyList())
    }


    private fun testNotification(): List<Notification> {
        return listOf(
            Notification(
                "",
                "Monday at 11:52 PM",
                "Lex Murphy",
                " requested approval for Gads Certificate  by",
                "Roseline Anapuna"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Peculiah C. Umeh",
                "commented on",
                "How to Archive a Program on MMS"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Baba C. Mammah",
                "created",
                "All Mentor Managers Task Report Report"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Lex Murphy",
                " requested approval for Gads Certificate  by",
                "Roseline Anapuna"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Peculiah C. Umeh",
                "commented on",
                "How to Archive a Program on MMS"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Baba C. Mammah",
                "created",
                "All Mentor Managers Task Report Report"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Lex Murphy",
                " requested approval for Gads Certificate  by",
                "Roseline Anapuna"
            ),
            Notification(
                "",
                "Monday at 11:52 PM",
                "Peculiah C. Umeh",
                "commented on",
                "How to Archive a Program on MMS"
            ),
        )
    }
}