package com.peculiaruc.alc_mmsystem_admin.ui.main

import android.os.Bundle
import android.view.Gravity
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.elevation = 0F
        init()
    }

    private fun init() {
        binding.drawer.setNavigationItemSelectedListener { menuItem ->
            binding.drawerLayout.closeDrawers()
            menuItem.isChecked = true

            // this condition for test only until other fragment be complete.
            if (menuItem.itemId == R.id.mentorMangerFragment || menuItem.itemId == R.id.adminProfileFragment || menuItem.itemId == R.id.homeFragment)
                binding.navHostFragment.findNavController().navigate(menuItem.itemId)
            true
        }
    }

    fun openDrawer() {
        binding.drawerLayout.openDrawer(Gravity.LEFT)
    }

    override fun onResume() {
        super.onResume()
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment)
        )
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavigation.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)
        setNavigationController(navController)
    }

    private fun setNavigationController(navController: NavController) {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, navController)
            navController.popBackStack(item.itemId, inclusive = false)
            true
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp() || super.onSupportNavigateUp()
    }

    fun setBottomNavigationVisibility(isVisible:Boolean){
        binding.bottomNavigation.isVisible = isVisible
    }
}