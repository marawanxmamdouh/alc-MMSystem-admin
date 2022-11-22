package com.peculiaruc.alc_mmsystem_admin.domain.models

data class ProgramDetails(
    val programName: String,
    val programImage: String,
    val about: String,
    val isAssigned: Boolean,
    val mentorMangersList: List<MentorMangersProgram>
)

data class MentorMangersProgram(val number: Int, val title: String)