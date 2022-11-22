package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentMentorManagerProfileBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.*
import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress
import com.peculiaruc.alc_mmsystem_admin.type.TaskStatus
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.*
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


class MentorManagerProfileFragment : BaseFragment<FragmentMentorManagerProfileBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_mentor_manager_profile
    override val viewModel: MentorManagerProfileViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, "Peculiah C. Umeh")
        setBottomNavigationVisibility(false)
        setHasOptionsMenu(true)
        setAdapter()
        onEvents()
    }

    private fun setAdapter() {
        viewModel.checkChip.observe(viewLifecycleOwner) {
            it?.let { chip ->
                binding.recyclerMentor.adapter = when (chip) {
                    R.id.chip_certificates -> {
                        CertificateAdapter(listCertificate, viewModel)
                    }
                    R.id.chip_tasks -> {
                        TaskAdapter(listTask, viewModel)
                    }
                    R.id.chip_mentors -> {
                        MentorAdapter(listMentor, viewModel)
                    }
                    R.id.chip_program -> {
                        ProgramAdapter(listProgram, viewModel)
                    }
                    R.id.chip_reports -> {
                        ReportAdapter(listReport, viewModel)
                    }
                    else -> {
                        null
                    }
                }
            }
        }
    }

    private fun onEvents() {
        viewModel.selectCertificateEvent.observe(viewLifecycleOwner, EventObserve { certificate ->
            // need to add certificate id
            findNavController().navigate(
                MentorManagerProfileFragmentDirections
                    .actionMentorManagerProfileFragmentToCertificateFragment(certificate.title)
            )
        })

        viewModel.selectTaskEvent.observe(viewLifecycleOwner, EventObserve { task ->
            findNavController().navigate(
                MentorManagerProfileFragmentDirections
                    .actionMentorManagerProfileFragmentToTaskDetailsFragment()
            )
        })

        viewModel.downloadReportEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                MentorManagerProfileFragmentDirections.actionMentorManagerProfileFragmentToBasicDialog(
                    DialogTypes.REPORT_DOWNLOAD
                )
            )
        })

        viewModel.shareReportEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                MentorManagerProfileFragmentDirections
                    .actionMentorManagerProfileFragmentToTwoActionDialogFragment(
                        DialogTypes.SHARE_REPORT
                    )
            )
        })

        viewModel.openReportDetailsEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                MentorManagerProfileFragmentDirections
                    .actionMentorManagerProfileFragmentToReportDetailsFragment()
            )
        })

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_mentor_manger_profile, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.chat) {

        }
        return super.onOptionsItemSelected(item)
    }


    //******** For Test Only ***********\\
    val listCertificate = listOf(
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2022 CERTIFICATE")
    )

    val listTask = listOf(
        Task("", "", TaskStatus.ASSIGN),
        Task("", "", TaskStatus.COMPLETED),
        Task("", "", TaskStatus.COMPLETED),
        Task("", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGN),
        Task("", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGN),
        Task("", "", TaskStatus.ASSIGN),
        Task("", "", TaskStatus.COMPLETED),
        Task("", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGNED),
    )

    val listMentor = listOf(
        Mentor(
            "Peculiar C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.", "MENTOR-GAD")
        ),
        Mentor(
            "Peculiar C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.", "MENTOR-GAD")
        ),
        Mentor(
            "Peculiar C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.")
        ),
        Mentor(
            "Peculiar C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.", "MENTOR-GAD")
        ),
        Mentor(
            "Peculiar C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.")
        ),
    )

    val listProgram = listOf(
        Program("", "", ProgramProgress.DOUBLE_CHECK),
        Program("", "", ProgramProgress.ADD),
        Program("", "", ProgramProgress.DOUBLE_CHECK),
        Program("", "", ProgramProgress.CHECK),
        Program("", "", ProgramProgress.ADD),
        Program("", "", ProgramProgress.DOUBLE_CHECK),
        Program("", "", ProgramProgress.CHECK),
        Program("", "", ProgramProgress.CHECK),
        Program("", "", ProgramProgress.DOUBLE_CHECK)
    )


    val listReport = listOf(
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Ibrahim Kabir ",
            "19th - 25th Oct 22"
        ),
    )
    /////////////////////////////////////
}