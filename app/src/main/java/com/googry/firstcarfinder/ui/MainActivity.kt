package com.googry.firstcarfinder.ui

import android.os.Bundle
import com.dino.library.ext.replaceFragmentInActivity
import com.dino.library.ui.BaseActivity
import com.googry.firstcarfinder.R
import com.googry.firstcarfinder.databinding.ActivityMainBinding
import com.googry.firstcarfinder.ui.carfinder.CarFinderFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragmentInActivity(CarFinderFragment(), binding.flCarFinderContainer.id)
    }
}
