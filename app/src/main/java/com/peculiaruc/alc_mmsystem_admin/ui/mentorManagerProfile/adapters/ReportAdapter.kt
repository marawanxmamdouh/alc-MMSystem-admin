package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Report
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

/**
 * Report adapter class for the Mentor Manger Profile fragment
 */
class ReportAdapter(
    items: List<Report>,
    listener: ReportInteractionListener
) : BaseAdapter<Report>(items, listener) {
    override val layoutID: Int = R.layout.item_report
}

/**
 * Report interaction listener for the Mentor Manger Profile fragment
 */
interface ReportInteractionListener : BaseInteractionListener {

    /**
     * done when share icon is clicked
     */
    fun onItemReportShare(item: Report)


    /**
     * done when download icon is clicked
     */
    fun onItemReportDownload(item: Report)


    /**
     * done when report item is clicked
     */
    fun onItemClick(item: Report)
}