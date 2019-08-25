package com.googry.firstcarfinder.remote.di

import com.googry.firstcarfinder.data.remote.DaumAutoRemoteDataSource
import com.googry.firstcarfinder.remote.impl.DaumAutoRemoteDataSourceImpl
import org.koin.dsl.module

val remoteModule = module {
    single<DaumAutoRemoteDataSource> { DaumAutoRemoteDataSourceImpl(get()) }
}