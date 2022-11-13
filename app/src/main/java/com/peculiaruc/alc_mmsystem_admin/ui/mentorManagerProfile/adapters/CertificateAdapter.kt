package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Certificate
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class CertificateAdapter(
    items: List<Certificate>,
    listener: CertificateInteractionListener
) : BaseAdapter<Certificate>(items, listener) {
    override val layoutID: Int = R.layout.item_certificate
}

interface CertificateInteractionListener : BaseInteractionListener {
    fun onItemCertificateSelected(item: Certificate)
}