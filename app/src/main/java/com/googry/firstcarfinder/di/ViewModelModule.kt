package com.googry.firstcarfinder.di

import com.googry.firstcarfinder.ui.carfinder.CarFinderViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CarFinderViewModel() }
}