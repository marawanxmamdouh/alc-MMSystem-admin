package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.basicDialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event


/**
 * this is the view-model for the dialog with only one action button.
 * */
class BasicDialogViewModel : ViewModel() {

    private val _dialogType = MutableLiveData<DialogTypes>()
    val dialogType: LiveData<DialogTypes> = _dialogType

    private val _doneEvent = MutableLiveData<Event<Boolean>>()
    val doneEvent: LiveData<Event<Boolean>> = _doneEvent


    /**
     *  this to set dialog title according to enum class.
     * */
    fun setTitle(type: DialogTypes) {
        _dialogType.postValue(type)
    }


    /**
     *  set action onclick for button in dialog.
     * */
    fun onClickDone() {
        _doneEvent.postValue(Event(true))
    }

}