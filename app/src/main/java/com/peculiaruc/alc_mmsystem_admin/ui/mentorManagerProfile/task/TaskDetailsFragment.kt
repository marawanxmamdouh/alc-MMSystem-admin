package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.task

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentTaskDetailsBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.TaskDetails
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve

class TaskDetailsFragment : BaseFragment<FragmentTaskDetailsBinding>() {
    override val layoutIdFragment: Int = R.layout.fragment_task_details
    override val viewModel: TaskViewModel by viewModels()

    //Just For Test
    private val list = listOf(
        TaskDetails("Mentor Managers assigned to this Task", 12),
        TaskDetails("Mentor Managers assigned to this Task", 12),
        TaskDetails("Task Reports", 12),
        TaskDetails("Task Reports", 12),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, getString(R.string.task_title))
        setBottomNavigationVisibility(false)
        binding.taskRecycler.adapter = TaskDetailsAdapter(list, viewModel)
        onEvents()
    }

    private fun onEvents() {
        viewModel.assignToTaskEvent.observe(viewLifecycleOwner, EventObserve {
            if (it) {
                Toast.makeText(requireContext(), "Will display Dialog", Toast.LENGTH_LONG).show()
            }
        })

        viewModel.viewTaskEvent.observe(viewLifecycleOwner, EventObserve {
            Toast.makeText(requireContext(), "Open another Fragment", Toast.LENGTH_LONG).show()
        })
    }
}