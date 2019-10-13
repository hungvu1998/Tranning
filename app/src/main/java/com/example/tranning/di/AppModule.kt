package com.example.tranning.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.room.Room
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.tranning.data.local.BreedDao
import com.example.tranning.data.local.Database
import com.example.tranning.util.Utils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): Database {
        return Room.databaseBuilder(
            application,
            Database::class.java,
            "DatabaseBreed.db"

        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideBreedDao(database: Database): BreedDao {
        return database.breedDao()
    }
    @Provides
    @Singleton
    fun provideUtils(application: Application): Utils = Utils(application)

    @Singleton
    @Provides
    internal fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }





}