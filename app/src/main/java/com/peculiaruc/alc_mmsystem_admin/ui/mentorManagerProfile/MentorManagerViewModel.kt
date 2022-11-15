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

class MentorManagerViewModel : ViewModel(), CertificateInteractionListener,
    TaskInteractionListener, MentorInteractionListener, ProgramInteractionListener {

    private val _selectCertificateEvent = MutableLiveData<Certificate>()
    val selectCertificateEvent: LiveData<Certificate> = _selectCertificateEvent

    val checkChip = MutableLiveData<Int>()

    override fun onItemCertificateSelected(item: Certificate) {
        _selectCertificateEvent.postValue(item)
    }

    override fun onItemTaskSelected(item: Task) {

    }

    override fun onItemMentorSelected(item: Mentor) {

    }

    override fun onProgramSelected(item: Program) {

    }


}