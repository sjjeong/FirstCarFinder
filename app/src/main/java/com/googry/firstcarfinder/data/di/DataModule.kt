package com.googry.firstcarfinder.data.di

import com.googry.firstcarfinder.data.impl.DaumAutoRepositoryImpl
import com.googry.firstcarfinder.domain.repository.DaumAutoRepository
import org.koin.dsl.module

val dataModule = module {
    single<DaumAutoRepository> { DaumAutoRepositoryImpl(get()) }
}