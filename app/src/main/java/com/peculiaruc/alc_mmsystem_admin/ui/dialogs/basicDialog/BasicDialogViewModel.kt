package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.basicDialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class BasicDialogViewModel : ViewModel() {

    private val _dialogType = MutableLiveData<DialogTypes>()
    val dialogType: LiveData<DialogTypes> = _dialogType

    private val _doneEvent = MutableLiveData<Event<Boolean>>()
    val doneEvent: LiveData<Event<Boolean>> = _doneEvent

    fun setTitle(type: DialogTypes) {
        _dialogType.postValue(type)
    }

    fun onClickDone() {
        _doneEvent.postValue(Event(true))
    }

}