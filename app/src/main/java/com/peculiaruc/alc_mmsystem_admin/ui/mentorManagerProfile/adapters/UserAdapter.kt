package com.peculiaruc.alc_mmsystem_admin.ui.mentorManagerProfile.adapters

import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.domain.models.Program
import com.peculiaruc.alc_mmsystem_admin.domain.models.User
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseInteractionListener

class UserAdapter(items: List<User>, listener: UserInteractionListener) :
    BaseAdapter<User>(items, listener) {
    override val layoutID: Int = R.layout.item_user

}

interface UserInteractionListener : BaseInteractionListener {
    fun onUserSelected(item: User)
}