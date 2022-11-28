package com.peculiaruc.alc_mmsystem_admin.ui.dialogs.twoActionDialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

/**
 * this represent the viewModel for the dialog that contain two action button.
 * */
class TwoActionDialogViewModel : ViewModel() {

    private val _dialogType = MutableLiveData<DialogTypes>()
    val dialogType: LiveData<DialogTypes> = _dialogType

    private val _dialogEvents = MutableLiveData<Event<Boolean>>()
    val dialogEvents : LiveData<Event<Boolean>> = _dialogEvents


    /**
     * to set type of the dialog so can decide the title and button text.
     * */
    fun setType(dialogType: DialogTypes) {
        _dialogType.postValue(dialogType)
    }

    /**
     * set event cancel in dialog screen
     * */
    fun onClickCancel() {
        _dialogEvents.postValue(Event(true))
    }

    /**
     * set event done in dialog screen
     * */
    fun onClickDone() {
        _dialogEvents.postValue(Event(true))
    }

}