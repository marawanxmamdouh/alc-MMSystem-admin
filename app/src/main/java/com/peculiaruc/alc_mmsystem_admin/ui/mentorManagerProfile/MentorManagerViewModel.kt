package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate
import com.peculiaruc.alc_mmsystem_admin.domain.models.Mentor
import com.peculiaruc.alc_mmsystem_admin.domain.models.Task
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.CertificateInteractionListener
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.MentorInteractionListener
import com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters.TaskInteractionListener

class MentorManagerViewModel : ViewModel(), CertificateInteractionListener,
    TaskInteractionListener, MentorInteractionListener {

    val checkChip = MutableLiveData<Int>()

    override fun onItemCertificateSelected(item: Certificate) {

    }

    override fun onItemTaskSelected(item: Task) {

    }

    override fun onItemMentorSelected(item: Mentor) {

    }


}