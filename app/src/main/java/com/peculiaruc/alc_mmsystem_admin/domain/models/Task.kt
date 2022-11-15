package com.peculiaruc.alc_mmsystem_admin.domain.models

import com.peculiaruc.alc_mmsystem_admin.type.TaskStatus

data class Task(val title: String, val time: String, val status: TaskStatus)