package com.peculiaruc.alc_mmsystem_admin.ui.notification

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Notification
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * Notification adapter class for the Notification
 */
class NotificationAdapter(items: List<Notification>, listener: NotificationInteractionListener) :
    BaseAdapter<Notification>(items, listener) {
    override val layoutID: Int = R.layout.item_notification
}

/**
 * Notification  interaction listener for the Notification
 */
interface NotificationInteractionListener : BaseInteractionListener {
    /**
     * done when the Notification item is Clicked
     */
    fun onNotificationClick(item: Notification)
}