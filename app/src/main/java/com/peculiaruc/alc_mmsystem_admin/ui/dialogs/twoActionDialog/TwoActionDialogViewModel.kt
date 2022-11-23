package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.twoActionDialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class TwoActionDialogViewModel : ViewModel() {

    private val _dialogType = MutableLiveData<DialogTypes>()
    val dialogType: LiveData<DialogTypes> = _dialogType

    private val _dialogEvents = MutableLiveData<Event<Boolean>>()
    val dialogEvents : LiveData<Event<Boolean>> = _dialogEvents

    fun setType(dialogType: DialogTypes) {
        _dialogType.postValue(dialogType)
    }

    fun onClickCancel() {
        _dialogEvents.postValue(Event(true))
    }

    fun onClickDone() {
        _dialogEvents.postValue(Event(true))
    }

}