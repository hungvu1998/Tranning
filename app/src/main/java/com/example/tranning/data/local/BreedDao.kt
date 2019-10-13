package com.example.tranning.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tranning.data.model.BreedModel
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface BreedDao {


    @Query("SELECT * FROM BreedModel where id =:i_d ")
    fun selectOne(i_d:Int): Observable<BreedModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertModel(breedModel: BreedModel)


}