package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.mentorManager

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.DialogMentorManagerBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseDialog
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve

class MentorManagerDialog : BaseDialog<DialogMentorManagerBinding>() {
    override val layoutIdFragment: Int = R.layout.dialog_mentor_manager
    override val viewModel: MentorMangerDialogViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.setCancelable(false)
        onEvents()

    }

    private fun onEvents() {
        viewModel.dialogEvents.observe(viewLifecycleOwner, EventObserve {
            if (it) {

            } else {
                dialog?.dismiss()
            }
        })
    }
}