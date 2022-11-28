package com.peculiaruc.alc_mmsystem_admin.domain.models


/**
 *  represent the Report object that will come from api .
 */
data class Report(val title: String, val author: String, val date: String) : Item()