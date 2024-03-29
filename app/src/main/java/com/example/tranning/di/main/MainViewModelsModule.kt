package com.example.tranning.di.main

import androidx.lifecycle.ViewModel
import com.example.tranning.di.ViewModelKey
import com.example.tranning.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class MainViewModelsModule {


    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun binMain2ViewModel(viewModel: MainViewModel): ViewModel




}