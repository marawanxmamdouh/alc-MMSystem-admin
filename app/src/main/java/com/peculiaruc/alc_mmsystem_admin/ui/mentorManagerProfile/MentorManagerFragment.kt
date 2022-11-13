package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.viewModels
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentMentorManagerBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.CertificateAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.TaskAdapter
import com.peculiaruc.alc_mmsystem_admin.utilities.TaskStatus


class MentorManagerFragment : BaseFragment<FragmentMentorManagerBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_mentor_manager
    override val viewModel: MentorManagerViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, "Peculiah C. Umeh")
        setHasOptionsMenu(true)
        setAdapter()
    }


    private fun setAdapter() {
        viewModel.checkChip.observe(viewLifecycleOwner) {
            it?.let {
                if (it == R.id.chip_certificates) {
                    //******** For Test Only ***********\\
                    val list = listOf(
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
                        Certificate("", ""),
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
                }
            }
        }
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