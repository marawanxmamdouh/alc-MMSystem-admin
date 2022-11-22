package com.peculiaruc.alc_mmsystem_admin.domain.models

data class Notification(
    val image: String,
    val date: String,
    val from: String,
    val action: String,
    val actionOn: String
)