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
            ),
            Notification(
                "",
                "Monday at 12:52 PM",
                "Peculiah C. Umeh",
                "commented on",
                "How to create a new project"
            ),
            Notification(
                "",
                "Monday at 10:52 PM",
                "Baba C. Mammah",
                "created",
                "All Mentor Managers Task Report Report"
            ),
            Notification(
                "",
                "Monday at 01:52 PM",
                "Murphy",
                " requested approval for Gads Certificate  by",
                "sarah Anapuna"
            ),
            Notification(
                "",
                "Monday at 02:52 PM",
                "C. Umeh",
                "commented on",
                "how to add a new mentor manager"
            ),
            Notification(
                "",
                "Monday at 06:52 PM",
                "Mammah",
                "created",
                "All Mentor Managers Task Report Report"
            ),
            Notification(
                "",
                "Monday at 08:52 PM",
                "Marawan Mamdouh",
                " requested approval for Gads Certificate  by",
                "Manage Mentor Manager"
            ),
            Notification(
                "",
                "Monday at 07:52 PM",
                "Nada",
                "commented on",
                "How to Archive a Program on MMS"
            )
        )
    }
}