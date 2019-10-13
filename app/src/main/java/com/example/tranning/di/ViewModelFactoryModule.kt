package com.example.tranning.di

import androidx.lifecycle.ViewModelProvider
import com.example.tranning.ViewModelProvidersFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(modelProviderFactory: ViewModelProvidersFactory): ViewModelProvider.Factory

}