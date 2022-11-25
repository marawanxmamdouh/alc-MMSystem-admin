package com.peculiaruc.alc_mmsystem_admin.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentHomeBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.main.MainActivity
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(false)
        setBottomNavigationVisibility(true)
        onEvents()
    }

    private fun onEvents() {
        viewModel.notificationEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                HomeFragmentDirections
                    .actionHomeFragmentToNotificationFragment()
            )
        })

        viewModel.drawerEvent.observe(viewLifecycleOwner, EventObserve {
            (requireActivity() as MainActivity).openDrawer()
        })

        viewModel.viewMMEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                HomeFragmentDirections
                    .actionHomeFragmentToMentorMangerFragment()
            )
        })

        viewModel.viewMentorsEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Mentors Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToMentorsFragment()
//            )
        })

        viewModel.viewProgramsEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Programs Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToProgramsFragment()
//            )
        })

        viewModel.createTaskEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Create Task Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToCreateTaskFragment()
//            )
        })

        viewModel.sentBroadcastEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Sent Broadcast Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToBroadcastFragment()
//            )
        })

        viewModel.addMentorManagerEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Add Mentor Manager Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToAddMentorManagerFragment()
//            )
        })

        viewModel.addMentorEvent.observe(viewLifecycleOwner, EventObserve {
            // TODO: Navigate to Add Mentor Fragment
//            findNavController().navigate(
//                HomeFragmentDirections
//                    .actionHomeFragmentToAddMentorFragment()
//            )
        })
    }
}