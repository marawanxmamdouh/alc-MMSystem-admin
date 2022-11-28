package com.peculiaruc.alc_mmsystem_admin.ui.notification

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentNotificationBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.Notification
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
            Toast.makeText(requireContext(), "open Notification", Toast.LENGTH_LONG).show()
        })
    }


}