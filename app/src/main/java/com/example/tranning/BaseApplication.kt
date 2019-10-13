package com.example.tranning

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import com.example.tranning.di.DaggerAppComponent

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}