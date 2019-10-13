package com.example.tranning.data.local

import androidx.room.RoomDatabase
import  androidx.room.Database
import com.example.tranning.data.model.BreedModel

@Database(entities = arrayOf(BreedModel::class), version = 8)
abstract class Database : RoomDatabase() {
    abstract fun breedDao(): BreedDao
}