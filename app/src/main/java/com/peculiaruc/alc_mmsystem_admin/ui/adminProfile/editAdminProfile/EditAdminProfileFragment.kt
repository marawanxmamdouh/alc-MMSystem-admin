package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile.editAdminProfile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentEditAdminProfileBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve

class EditAdminProfileFragment : BaseFragment<FragmentEditAdminProfileBinding>() {
    override val layoutIdFragment: Int = R.layout.fragment_edit_admin_profile
    override val viewModel: EditAdminProfileViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, getString(R.string.edit_profile_title))
        setBottomNavigationVisibility(false)
        observeEvents()
    }

    private fun observeEvents() {
        viewModel.onClickSaveEvent.observe(viewLifecycleOwner, EventObserve {
            if (it) {
                findNavController().navigateUp()
            }
        })

        viewModel.onSelectImageEvent.observe(viewLifecycleOwner, EventObserve {
            getImageFromGallery()
        })
    }

    private var resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                binding.imageProfile.setImageURI(data?.data)
            }
        }

    private fun getImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        resultLauncher.launch(intent)
    }

}