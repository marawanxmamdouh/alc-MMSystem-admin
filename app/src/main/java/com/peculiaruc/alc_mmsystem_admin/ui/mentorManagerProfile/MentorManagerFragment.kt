package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentMentorManagerBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress
import com.peculiaruc.alc_mmsystem_admin.type.TaskStatus
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.CertificateAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.MentorAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.ProgramAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.TaskAdapter
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


class MentorManagerFragment : BaseFragment<FragmentMentorManagerBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_mentor_manager
    override val viewModel: MentorManagerViewModel by viewModels()

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
            it?.let {
                if (it == R.id.chip_certificates) {
                    //******** For Test Only ***********\\
                    val list = listOf(
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
                    /////////////////////////////////////
                    binding.recyclerMentor.adapter = CertificateAdapter(list, viewModel)
                } else if (it == R.id.chip_tasks) {
                    //******** For Test Only ***********\\
                    val list = listOf(
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
                    /////////////////////////////////////
                    binding.recyclerMentor.adapter = TaskAdapter(list, viewModel)
                } else if (it == R.id.chip_mentors) {
                    //******** For Test Only ***********\\
                    val list = listOf(
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
                    /////////////////////////////////////
                    binding.recyclerMentor.adapter = MentorAdapter(list, viewModel)
                } else if (it == R.id.chip_program) {
                    //******** For Test Only ***********\\
                    val list = listOf(
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
                    /////////////////////////////////////
                    binding.recyclerMentor.adapter = ProgramAdapter(list, viewModel)
                }

            }
        }
    }

    private fun onEvents() {
        viewModel.selectCertificateEvent.observe(
            viewLifecycleOwner,
            EventObserve { certificate ->
                // need to add certificate id
                findNavController().navigate(
                    MentorManagerFragmentDirections
                        .actionMentorManagerFragmentToCertificateFragment(certificate.title)
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

}