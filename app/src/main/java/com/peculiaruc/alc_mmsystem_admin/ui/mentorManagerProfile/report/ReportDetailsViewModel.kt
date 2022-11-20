package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.report

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class ReportDetailsViewModel : ViewModel() {

    private val _closeReportEvent = MutableLiveData<Event<Boolean>>()
    val closeReportEvent: LiveData<Event<Boolean>> = _closeReportEvent

    private val _downloadReportEvent = MutableLiveData<Event<Boolean>>()
    val downloadReportEvent: LiveData<Event<Boolean>> = _downloadReportEvent

    private val _shareReportEvent = MutableLiveData<Event<Boolean>>()
    val shareReportEvent: LiveData<Event<Boolean>> = _shareReportEvent

    fun onClickClose() {
        _closeReportEvent.postValue(Event(true))
    }

    fun onClickDownload() {
        _downloadReportEvent.postValue(Event(true))
    }

    fun onClickShare() {
        _shareReportEvent.postValue(Event(true))
    }

}