package com.googry.firstcarfinder.remote.di

import com.googry.firstcarfinder.data.remote.DaumAutoRemoteDataSource
import com.googry.firstcarfinder.remote.api.DaumAutoApi
import com.googry.firstcarfinder.remote.impl.DaumAutoRemoteDataSourceImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val remoteModule = module {
    single<DaumAutoApi> { get<Retrofit>().create(DaumAutoApi::class.java) }
    single<DaumAutoRemoteDataSource> { DaumAutoRemoteDataSourceImpl(get()) }
}