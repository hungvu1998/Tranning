package com.example.tranning.di

import com.example.tranning.di.main.MainModule
import com.example.tranning.di.main.MainViewModelsModule
import com.example.tranning.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuildersModule {



    @ContributesAndroidInjector(modules = [ MainViewModelsModule::class, MainModule::class])
    abstract fun contributeMain2Activity(): MainActivity


}