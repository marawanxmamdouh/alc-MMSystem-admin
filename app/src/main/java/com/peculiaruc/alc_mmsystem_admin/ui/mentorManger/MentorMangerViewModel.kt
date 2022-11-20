package com.peculiaruc.alc_mmsystem_admin.ui.mentorManger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class MentorMangerViewModel : ViewModel(), MentorMangerInteractionListener {

    private val _selectItemMange = MutableLiveData<Event<Mentor>>()
    val selectItemMange: LiveData<Event<Mentor>> = _selectItemMange

    override fun onItemMentorMangerSelected(item: Mentor) {
        _selectItemMange.postValue(Event(item))
    }
}