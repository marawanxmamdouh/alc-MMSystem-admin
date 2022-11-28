package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.certificate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

/**
 * Certificate viewModel for Program Details screen.
 * */
class CertificateViewModel : ViewModel() {

    // 0 represent type of download .
    private val _downloadEvent = MutableLiveData<Event<Int>>()
    val downloadEvent: LiveData<Event<Int>> = _downloadEvent

    fun onClickDownload() {
        // 0 should change according to download type that will be available.
        _downloadEvent.postValue(Event(0))
    }
}