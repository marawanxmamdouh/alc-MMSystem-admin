package com.peculiaruc.alc_mmsystem_admin.ui.mentorManger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

/**
 * this is the viewModel for MentorMangerFragment.
 */
class MentorMangerViewModel : ViewModel(), MentorMangerInteractionListener {

    private val _selectItemMange = MutableLiveData<Event<Mentor>>()
    val selectItemMange: LiveData<Event<Mentor>> = _selectItemMange

    private val _addMentorEvent = MutableLiveData<Event<Boolean>>()
    val addMentorEvent: LiveData<Event<Boolean>> = _addMentorEvent

    override fun onItemMentorMangerSelected(item: Mentor) {
        _selectItemMange.postValue(Event(item))
    }

    fun addMentorManger() {
        _addMentorEvent.postValue(Event(true))
    }
}