package com.peculiaruc.alc_mmsystem_admin.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentHomeBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.main.MainActivity


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(false)
        setBottomNavigationVisibility(true)
        binding.buttonTest.setOnClickListener {
            (requireActivity() as MainActivity).openDrawer()
        }

        // for test report Details..
        binding.buttonReportDetails.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToReportDetailsFragment())
        }
    }


}