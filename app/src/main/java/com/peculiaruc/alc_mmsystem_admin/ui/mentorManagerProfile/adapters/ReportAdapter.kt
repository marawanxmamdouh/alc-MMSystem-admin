package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Report
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class ReportAdapter(
    items: List<Report>,
    listener: ReportInteractionListener
) : BaseAdapter<Report>(items, listener) {
    override val layoutID: Int = R.layout.item_report
}

interface ReportInteractionListener : BaseInteractionListener {
    fun onItemReportShare(item: Report)
    fun onItemReportDownload(item: Report)
}