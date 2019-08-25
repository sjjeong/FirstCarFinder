package com.googry.firstcarfinder

import android.app.Application
import com.dino.library.di.getDinoNetworkModule
import com.dino.library.ext.setupKoin
import com.googry.firstcarfinder.data.di.dataModule
import com.googry.firstcarfinder.di.viewModelModule
import com.googry.firstcarfinder.domain.di.domainModule
import com.googry.firstcarfinder.remote.di.remoteModule

class DinoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(
            this,
            getDinoNetworkModule(BuildConfig.DAUM_HOST),
            viewModelModule,
            domainModule,
            dataModule,
            remoteModule
        )
    }

}