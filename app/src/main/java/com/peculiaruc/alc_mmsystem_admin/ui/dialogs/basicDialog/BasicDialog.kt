package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.basicDialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.DialogBasicBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseDialog
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve
import com.peculiaruc.alc_mmsystem_admin.utilities.setWidthPercent

/**
 * this represent any dialog with only one action button.
 * */
class BasicDialog : BaseDialog<DialogBasicBinding>() {
    override val layoutIdFragment: Int = R.layout.dialog_basic
    override val viewModel: BasicDialogViewModel by viewModels()
    private val args: BasicDialogArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setWidthPercent(90)
        viewModel.setTitle(args.dialogType)
        dialog?.setCancelable(false)
        onEvents()
    }

    private fun onEvents() {
        viewModel.doneEvent.observe(viewLifecycleOwner, EventObserve {
            if (it) {
                getAction(args.dialogType)?.let {
                    findNavController().navigate(it)
                } ?: dialog?.dismiss()
            }
        })
    }

    private fun getAction(type: DialogTypes): NavDirections? {
        return when (type) {
            DialogTypes.SAVED_PROFILE -> BasicDialogDirections.actionBasicDialogToAdminProfileFragment()
            DialogTypes.ASSIGNED_TO_MENTOR -> TODO()
            DialogTypes.UNASSIGNED_TO_MENTOR -> TODO()
            DialogTypes.UNASSIGNED_TO_PROGRAM,
            DialogTypes.ASSIGNED_TO_PROGRAM,
            DialogTypes.REPORT_DOWNLOAD,
            DialogTypes.ASSIGNED_TASK,
            DialogTypes.UNASSIGNED_TASK,
            DialogTypes.CERTIFICATE_DOWNLOAD -> null
            else -> null
        }
    }
}