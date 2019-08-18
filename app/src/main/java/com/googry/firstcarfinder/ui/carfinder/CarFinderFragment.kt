package com.googry.firstcarfinder.ui.carfinder

import com.dino.library.ui.BaseFragment
import com.googry.firstcarfinder.R
import com.googry.firstcarfinder.databinding.FragmentCarFinderBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CarFinderFragment : BaseFragment<FragmentCarFinderBinding, CarFinderViewModel>(
    R.layout.fragment_car_finder
) {
    override val viewModel by viewModel<CarFinderViewModel>()

}