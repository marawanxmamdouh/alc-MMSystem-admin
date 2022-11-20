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


class NotificationFragment : BaseFragment<FragmentNotificationBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_notification
    override val viewModel: NotificationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, getString(R.string.notification_title))
        setBottomNavigationVisibility(true)
        onEvents()
        binding.recyclerNotifications.adapter = NotificationAdapter(list, viewModel)
    }

    private fun onEvents() {
        viewModel.selectNotificationEvent.observe(viewLifecycleOwner, EventObserve {
            Toast.makeText(requireContext(), "open Notifcation", Toast.LENGTH_LONG).show()
        })
    }


    //For Test
    val list = listOf(
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
    ////////////
}