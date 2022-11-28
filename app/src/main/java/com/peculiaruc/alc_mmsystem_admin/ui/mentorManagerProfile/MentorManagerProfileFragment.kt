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

/**
 * represent the Mentor Manager Profile screen.
 * */
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

        viewModel.selectProgramEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(
                MentorManagerProfileFragmentDirections
                    .actionMentorManagerProfileFragmentToProgramDetailsFragment()
            )
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_mentor_manger_profile, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.chat) {
            Toast.makeText(requireContext(),"Chat icon",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    //******** For Test Only ***********\\
    val listCertificate = listOf(
        Certificate("", "GADS CLOUD 2022 CERTIFICATE"),
        Certificate("", "GADS ANDROID 2022 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2021 CERTIFICATE"),
        Certificate("", "GADS ANDROID 2021 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2020 CERTIFICATE"),
        Certificate("", "GADS ANDROID 2020 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2019 CERTIFICATE"),
        Certificate("", "GADS ANDROID 2019 CERTIFICATE"),
        Certificate("", "GADS CLOUD 2019 CERTIFICATE"),
        Certificate("", "GADS ANDROID 2019 CERTIFICATE"),
        Certificate("", "GADS WEB 2020 CERTIFICATE"),
        Certificate("", "GADS WEB 2021 CERTIFICATE")
    )

    val listTask = listOf(
        Task("", "", TaskStatus.ASSIGN),
        Task("test", "", TaskStatus.COMPLETED),
        Task("", "", TaskStatus.COMPLETED),
        Task("test", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGN),
        Task("test", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGN),
        Task("test", "", TaskStatus.ASSIGN),
        Task("", "", TaskStatus.COMPLETED),
        Task("test", "", TaskStatus.ASSIGNED),
        Task("", "", TaskStatus.ASSIGNED),
    )

    val listMentor = listOf(
        Mentor(
            "Peculiar C. Umeh", "", "P Assistant, Andela, She/her",
            listOf("PROGRAM ASS", "MENTOR-WEB")
        ),
        Mentor(
            "Nada C. Umeh", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASSISTANT.", "MENTOR-GAD")
        ),
        Mentor(
            "Marawan C. Umeh", "", "Program Assistant, Andela, he/his",
            listOf("PROGRAM ASST GCP.")
        ),
        Mentor(
            "Peculiar C. ", "", "Program Assistant, Andela, She/her",
            listOf("PROGRAM ASST.", "MENTOR-GCP")
        ),
        Mentor(
            "Marawan C. Umeh", "", "Program Assistant, Andela, he/his",
            listOf("PROGRAM ASST.")
        ),
    )

    val listProgram = listOf(
        Program("Test", "", ProgramProgress.DOUBLE_CHECK),
        Program("Test", "", ProgramProgress.ADD),
        Program("asd", "", ProgramProgress.DOUBLE_CHECK),
        Program("Test", "", ProgramProgress.CHECK),
        Program("asd", "", ProgramProgress.ADD),
        Program("Test", "", ProgramProgress.DOUBLE_CHECK),
        Program("asd", "", ProgramProgress.CHECK),
        Program("Test", "", ProgramProgress.CHECK),
        Program("asd", "", ProgramProgress.DOUBLE_CHECK)
    )


    val listReport = listOf(
        Report(
            "Google Scholarship Africa Report", "By Ibrahem Kabir ",
            "18th - 25th Oct 22"
        ),
        Report(
            "Google Scholarship Asia Report", "By Marawan Mamdouh ",
            "13th - 25th Oct 22"
        ),
        Report(
            "Google Scholarship Report", "By Nada ",
            "17th - 25th Oct 22"
        ),
        Report(
            "Google Asia Scholarship Report", "By Ibrahim Kabir ",
            "20th - 25th Oct 22"
        ),
        Report(
            "Google America Scholarship Report", "By Ibrahim Marawan ",
            "16th - 25th Oct 22"
        ),
        Report(
            "Google Scholarship Asia Report", "By Nada Kabir ",
            "21th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Nada Ibrahim ",
            "01th - 25th Oct 22"
        ),
        Report(
            "Google Asia Scholarship Report", "By Nada Ibrahim ",
            "03th - 25th Oct 22"
        ),
        Report(
            "Google America Scholarship Report", "By Ibrahim ",
            "06th - 25th Oct 22"
        ),
        Report(
            "Google Africa Scholarship Report", "By Kabir ",
            "08th - 25th Oct 22"
        ),
    )
}