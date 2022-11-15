package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile.editAdminProfile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EditAdminProfileViewModel : ViewModel() {

    private val _onClickSaveEvent = MutableLiveData(false)
    val onClickSaveEvent: LiveData<Boolean> = _onClickSaveEvent

    fun saveData() {
        _onClickSaveEvent.postValue(true)
    }

    fun onSelectFormGallery(){

    }

}