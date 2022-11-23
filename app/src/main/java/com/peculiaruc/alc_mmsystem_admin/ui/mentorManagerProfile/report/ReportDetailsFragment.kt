package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.report

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentTaskDetailsBinding
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


class ReportDetailsFragment : BaseFragment<FragmentTaskDetailsBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_report_details
    override val viewModel: ReportDetailsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(false)
        setBottomNavigationVisibility(false)
        observeEvent()
    }

    private fun observeEvent() {
        viewModel.closeReportEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigateUp()
        })

        viewModel.shareReportEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                ReportDetailsFragmentDirections.actionReportDetailsFragmentToTwoActionDialogFragment(
                    DialogTypes.SHARE_REPORT
                )
            )
        })

        viewModel.downloadReportEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                ReportDetailsFragmentDirections.actionReportDetailsFragmentToBasicDialog(DialogTypes.REPORT_DOWNLOAD)
            )
        })
    }

}