package com.peculiaruc.alc_mmsystem_admin.ui.adminProfile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdminProfileViewModel : ViewModel() {

    private val _openLinkEvent = MutableLiveData<String>()
    val openLinkEvent: MutableLiveData<String> = _openLinkEvent


    fun onClickGithub() {
        _openLinkEvent.postValue("https://github.com/")
    }

    fun onClickLinkedIn() {
        _openLinkEvent.postValue("https://www.linkedin.com/feed/")
    }

    fun onClickInstagram() {
        _openLinkEvent.postValue("https://www.instagram.com/")
    }

    fun onClickTwitter() {
        _openLinkEvent.postValue("https://twitter.com/home")
    }
}