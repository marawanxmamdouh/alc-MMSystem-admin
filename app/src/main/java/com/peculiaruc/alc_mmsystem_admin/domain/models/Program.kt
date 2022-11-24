package com.peculiaruc.alc_mmsystem_admin.domain.models

import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress

data class Program(
    val programTitle: String,
    val programDate: String,
    val progress: ProgramProgress
) : Item()