package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile.editAdminProfile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class EditAdminProfileViewModel : ViewModel() {

    private val _onClickSaveEvent = MutableLiveData<Event<Boolean>>()
    val onClickSaveEvent: LiveData<Event<Boolean>> = _onClickSaveEvent

    private val _onSelectImageEvent = MutableLiveData<Event<Boolean>>()
    val onSelectImageEvent: LiveData<Event<Boolean>> = _onSelectImageEvent

    fun saveData() {
        _onClickSaveEvent.postValue(Event(true))
    }

    fun onSelectFormGallery() {
        _onSelectImageEvent.postValue(Event(true))
    }

}