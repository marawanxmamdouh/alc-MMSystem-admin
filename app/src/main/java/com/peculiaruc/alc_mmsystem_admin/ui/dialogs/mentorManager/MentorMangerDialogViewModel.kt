package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.mentorManager

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class MentorMangerDialogViewModel : ViewModel() {

    private val _invitationSent = MutableLiveData(false)
    val invitationSent: LiveData<Boolean> = _invitationSent

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _dialogEvents = MutableLiveData<Event<Boolean>>()
    val dialogEvents: LiveData<Event<Boolean>> = _dialogEvents


    fun onClickSend() {
        if (_invitationSent.value == false) {
            _dialogEvents.postValue(Event(true))
            _invitationSent.postValue(true)
        } else {
            _dialogEvents.postValue(Event(false))
        }
    }

    fun onClickCancel() {
        _dialogEvents.postValue(Event(false))
    }
}