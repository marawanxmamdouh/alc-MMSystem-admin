package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate

class MentorManagerViewModel : ViewModel(), CertificateInteractionListener {

    val checkChip = MutableLiveData<Int>()

    override fun onItemCertificateSelected(item: Certificate) {

    }


}