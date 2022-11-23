package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.program

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.MentorMangersProgram
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

class ProgramDetailsViewModel : ViewModel(), ProgramDetailInteractionListener {

    private val _isAssigned = MutableLiveData(false)
    val isAssigned: LiveData<Boolean> = _isAssigned

    private val _assignedEvent = MutableLiveData<Event<Boolean>>()
    val assignedEvent: LiveData<Event<Boolean>> = _assignedEvent

    private val _mentorMangers = MutableLiveData<List<MentorMangersProgram>>()
    val mentorMangers: LiveData<List<MentorMangersProgram>> = _mentorMangers

    init {
        _mentorMangers.postValue(
            listOf(
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
            )
        )
    }

    fun onAssignProgram() {
        _assignedEvent.postValue(Event(_isAssigned.value!!))
    }

     fun setAssigned(isAssigned: Boolean) {
        _isAssigned.postValue(isAssigned)
    }

    override fun onProgramDetailsView(item: MentorMangersProgram) {

    }


}