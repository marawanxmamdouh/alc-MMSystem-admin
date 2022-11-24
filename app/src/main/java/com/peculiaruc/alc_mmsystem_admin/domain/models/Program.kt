package com.peculiaruc.alc_mmsystem_admin.domain.models

import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress

data class Program(val programTitle: String, val programDate: String, val progress: ProgramProgress,
                   val image_program:Int,
                   val image_progress:Int,
                   val text_title: String)