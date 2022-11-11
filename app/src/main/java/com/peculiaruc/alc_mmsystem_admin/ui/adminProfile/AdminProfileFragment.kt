package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentAdminProfileBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment

class AdminProfileFragment : BaseFragment<FragmentAdminProfileBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_admin_profile
    override val viewModel: AdminProfileViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        observeEvents()
    }

    private fun observeEvents() {
        viewModel.openLinkEvent.observe(viewLifecycleOwner) {
            if (!it.isNullOrBlank()) {
                openURL(it)
            }
        }
    }

    private fun openURL(url: String) {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_profile, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.EditAdminProfile) {
            findNavController().navigate(AdminProfileFragmentDirections.actionAdminProfileFragmentToEditAdminProfileFragment())
        }
        return super.onOptionsItemSelected(item)
    }
}