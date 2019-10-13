package com.example.tranning.di.main

import com.example.tranning.network.MainApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainModule{
    @Provides
    fun provideMain2Api(retrofit: Retrofit): MainApi {
        return retrofit.create(MainApi::class.java)
    }






}