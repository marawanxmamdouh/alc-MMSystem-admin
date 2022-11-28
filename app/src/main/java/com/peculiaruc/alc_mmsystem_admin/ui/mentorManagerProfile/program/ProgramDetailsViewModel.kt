package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.program

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.alc_mmsystem_admin.domain.models.MentorMangersProgram
import com.peculiaruc.alc_mmsystem_admin.utilities.event.Event

/**
 * represent viewModel for Program Details screen.
 * */
class ProgramDetailsViewModel : ViewModel(), ProgramDetailInteractionListener {

    private val _isAssigned = MutableLiveData(false)
    val isAssigned: LiveData<Boolean> = _isAssigned

    private val _assignedEvent = MutableLiveData<Event<Boolean>>()
    val assignedEvent: LiveData<Event<Boolean>> = _assignedEvent

    private val _mentorMangers = MutableLiveData<List<MentorMangersProgram>>()
    val mentorMangers: LiveData<List<MentorMangersProgram>> = _mentorMangers

    private val _mentorMangersProgramEvent = MutableLiveData<Event<MentorMangersProgram>>()
    val mentorMangersProgramEvent: LiveData<Event<MentorMangersProgram>> =
        _mentorMangersProgramEvent

    init {
        _mentorMangers.postValue(
            listOf(
                MentorMangersProgram(80, "Mentor Managers \nassigned to \nthis program"),
            )
        )
    }

    /**
     * change last event when button assign is clicked
     */
    fun onAssignProgram() {
        _assignedEvent.postValue(Event(_isAssigned.value!!))
    }

    /**
     * set event when button assign is clicked
     */
    fun setAssigned(isAssigned: Boolean) {
        _isAssigned.postValue(isAssigned)
    }

    // set event when item program  is clicked
    override fun onProgramDetailsView(item: MentorMangersProgram) {
        _mentorMangersProgramEvent.postValue(Event(item))
    }


}