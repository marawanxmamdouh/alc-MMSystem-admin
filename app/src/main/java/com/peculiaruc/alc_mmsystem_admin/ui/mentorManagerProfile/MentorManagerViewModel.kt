package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.CertificateInteractionListener
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.MentorInteractionListener
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.ProgramInteractionListener
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.TaskInteractionListener
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class MentorManagerViewModel : ViewModel(), CertificateInteractionListener,
    TaskInteractionListener, MentorInteractionListener, ProgramInteractionListener {

    private val _selectCertificateEvent = MutableLiveData<Event<Certificate>>()
    val selectCertificateEvent: LiveData<Event<Certificate>> = _selectCertificateEvent

    private val _selectTaskEvent = MutableLiveData<Event<Task>>()
    val selectTaskEvent: LiveData<Event<Task>> = _selectTaskEvent

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


}