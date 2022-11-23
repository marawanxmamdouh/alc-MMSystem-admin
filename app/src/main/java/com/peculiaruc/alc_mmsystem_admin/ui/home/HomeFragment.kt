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
    }


}