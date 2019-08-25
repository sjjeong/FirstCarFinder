package com.googry.firstcarfinder.domain.di

import com.googry.firstcarfinder.domain.usecase.GetCarInfoUseCase
import org.koin.dsl.module

val domainModule = module {
    single { GetCarInfoUseCase(get()) }
}