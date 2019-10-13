package com.example.tranning.data.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class BreedModel (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id:Int ,
    @ColumnInfo(name = "breedName")
    var breedName:String?=null,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    var img: ByteArray? = null


): Serializable