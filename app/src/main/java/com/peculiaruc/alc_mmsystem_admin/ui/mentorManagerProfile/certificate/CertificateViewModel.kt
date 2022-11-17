package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.certificate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CertificateViewModel : ViewModel() {

    // 0 represent type of download .
    private val _downloadEvent = MutableLiveData<Int>()
    val downloadEvent: LiveData<Int> = _downloadEvent

    fun onClickDownload() {
        // 0 should change according to download type that will be available.
        _downloadEvent.postValue(0)
    }
}