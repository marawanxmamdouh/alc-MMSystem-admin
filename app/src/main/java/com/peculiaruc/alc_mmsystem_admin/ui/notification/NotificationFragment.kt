package com.peculiaruc.alc_mmsystem_admin.ui.notification

import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.PopupMenu
import androidx.fragment.app.viewModels
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentNotificationBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


/**
 * this represent Notification screen..
 */
class NotificationFragment : BaseFragment<FragmentNotificationBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_notification
    override val viewModel: NotificationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, getString(R.string.notification_title))
        setBottomNavigationVisibility(true)
        onEvents()
        binding.recyclerNotifications.adapter = NotificationAdapter(emptyList(), viewModel)
    }

    private fun onEvents() {
        viewModel.selectNotificationEvent.observe(viewLifecycleOwner, EventObserve {
            val popup = PopupMenu(requireContext(), it.view)
            val inflater: MenuInflater = popup.getMenuInflater()
            inflater.inflate(R.menu.notification_menu, popup.getMenu())
            popup.show()

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.delete -> {
                        viewModel.deleteNotification(it.notification)
                    }
                    R.id.make_as_read -> {

                    }
                }
                false
            }
        })
    }


}