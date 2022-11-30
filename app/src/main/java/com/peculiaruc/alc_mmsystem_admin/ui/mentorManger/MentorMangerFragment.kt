package com.peculiaruc.alc_mmsystem_admin.ui.mentorManger

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.FragmentMentorMangerBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseFragment
import com.peculiaruc.alc_mmsystem_admin.utilities.event.EventObserve


/**
 * this represent MentorManger screen..
 */
class MentorMangerFragment : BaseFragment<FragmentMentorMangerBinding>() {

    override val layoutIdFragment: Int = R.layout.fragment_mentor_manger
    override val viewModel: MentorMangerViewModel by viewModels()

    //*******For Text*******
    val list = listOf(
        Mentor("asd1", "", "", listOf()),
        Mentor("asd2", "", "", listOf()),
        Mentor("asd3", "", "", listOf()),
        Mentor("asd4", "", "", listOf()),
        Mentor("asd5", "", "", listOf()),
        Mentor("asd6", "", "", listOf()),
        Mentor("asd7", "", "", listOf()),
        Mentor("asd8", "", "", listOf()),
        Mentor("asd9", "", "", listOf()),
    )
    //////////////////

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(true, getString(R.string.mentor_manger_title))
        setBottomNavigationVisibility(false)
        setHasOptionsMenu(true)
        binding.recyclerMentorMangers.adapter = MentorMangerAdapter(list, viewModel)
        observeEvents()
    }

    private fun observeEvents() {
        viewModel.selectItemMange.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(MentorMangerFragmentDirections.actionMentorMangerFragmentToMentorManagerProfileFragment())
        })

        viewModel.addMentorEvent.observe(viewLifecycleOwner, EventObserve {
            findNavController().navigate(MentorMangerFragmentDirections.actionMentorMangerFragmentToMentorManagerDialog())
        })
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_mentor_manger, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.message -> {

            }
            R.id.search -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}