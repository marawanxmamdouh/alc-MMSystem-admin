package com.peculiaruc.alc_mmsystem_admin.ui.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.peculiaruc.alc_mmsystem_admin.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.setting_title)
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

}
