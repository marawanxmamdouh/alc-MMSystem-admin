package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile.editAdminProfile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentEditAdminProfileBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes

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
        viewModel.onClickSaveEvent.observe(viewLifecycleOwner) {
            if (it) {
                findNavController()
                    .navigate(
                        EditAdminProfileFragmentDirections
                            .actionEditAdminProfileFragmentToBasicDialog(DialogTypes.SAVED_PROFILE)
                    )
            }
        }
    }


}