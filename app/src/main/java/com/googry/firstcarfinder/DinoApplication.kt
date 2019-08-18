package com.googry.firstcarfinder

import android.app.Application
import com.dino.library.ext.setupKoin
import com.googry.firstcarfinder.di.viewModelModule

class DinoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(this, viewModelModule)
    }

}