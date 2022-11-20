package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.*
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.*
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class MentorManagerProfileViewModel : ViewModel(), CertificateInteractionListener,
    TaskInteractionListener, MentorInteractionListener, ProgramInteractionListener,
    ReportInteractionListener {

    private val _selectCertificateEvent = MutableLiveData<Event<Certificate>>()
    val selectCertificateEvent: LiveData<Event<Certificate>> = _selectCertificateEvent

    private val _selectTaskEvent = MutableLiveData<Event<Task>>()
    val selectTaskEvent: LiveData<Event<Task>> = _selectTaskEvent

    private val _downloadReportEvent = MutableLiveData<Event<Report>>()
    val downloadReportEvent: LiveData<Event<Report>> = _downloadReportEvent

    private val _shareReportEvent = MutableLiveData<Event<Report>>()
    val shareReportEvent: LiveData<Event<Report>> = _shareReportEvent

    private val _openReportDetailsEvent = MutableLiveData<Event<Report>>()
    val openReportDetailsEvent: LiveData<Event<Report>> = _openReportDetailsEvent

    val checkChip = MutableLiveData<Int>()

    override fun onItemCertificateSelected(item: Certificate) {
        _selectCertificateEvent.postValue(Event(item))
    }

    override fun onItemTaskSelected(item: Task) {
        _selectTaskEvent.postValue(Event(item))
    }

    override fun onItemMentorSelected(item: Mentor) {

    }

    override fun onProgramSelected(item: Program) {

    }


    override fun onItemReportShare(item: Report) {
        _shareReportEvent.postValue(Event(item))
    }

    override fun onItemReportDownload(item: Report) {
        _downloadReportEvent.postValue(Event(item))
    }

    override fun onItemClick(item: Report) {
        _openReportDetailsEvent.postValue(Event(item))
    }


}