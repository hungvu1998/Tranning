package com.example.tranning.ui.main

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tranning.data.local.BreedDao
import com.example.tranning.data.model.BreedModel
import com.example.tranning.network.MainApi
import com.example.tranning.util.Utils
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL
import java.nio.ByteBuffer
import javax.inject.Inject





class MainViewModel  @Inject constructor(val main2Api: MainApi,val utils: Utils,val breedDao: BreedDao) : ViewModel() {


    var dogs: MutableLiveData<BreedModel> = MutableLiveData()
    var dogsList: MutableLiveData<ArrayList<BreedModel>> = MutableLiveData()
    fun observeObject(){
        val hasConnection = utils.isConnectedToInternet()
        if(hasConnection)
            getObjectBreedRoot()
        else{
            Log.d("kiemtra","khong co mang")
          //  dogsList.value=breedDao.selectList()
            Log.d("kiemtra",""+breedDao.selectOne(1).observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe({
                Log.d("kiemtra",""+it.img!!.size)
            }))
        }

    }



    fun getObjectBreedRoot(){
        main2Api.getAllDog2()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                getListImglBreed(it.message!!)

            },{
                Log.d("kiemtra2",""+it.message)
            })
    }
    fun getListImglBreed(listName : List<String>){
        Observable.fromIterable(listName)
            .map {
                main2Api.getImage2(it)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({rootBreed ->
                        getDetailBreed(it!!,rootBreed.message!!)

                    },{
                        Log.d("kiemtra2",""+it.message)
                    })
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{

            }

    }
    var i=0
    fun getDetailBreed(name:String,listImg : List<String>){

        Observable.fromIterable(listImg)

            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                Observable.fromCallable<Any>{
                    download_img(it)
                }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({bitmap->
                        if(bitmap!=null){
                            val bitmap_=bitmap as Bitmap
                            val size = bitmap_.getRowBytes() * bitmap_.getHeight()
                            val byteBuffer = ByteBuffer.allocate(size)
                            bitmap_.copyPixelsToBuffer(byteBuffer)

                            val breedModel = BreedModel(i++,name, byteBuffer.array())
                            dogs.value=breedModel
                            breedDao.insertModel(breedModel)
                        }
                        else{
                            Log.d("kiemtra","null")
                        }
                    })
            }
    }
    /*
    //Byte to bitmap
    Bitmap.Config configBmp = Bitmap.Config.valueOf(bitmap.getConfig().name());
Bitmap bitmap_tmp = Bitmap.createBitmap(width, height, configBmp);
ByteBuffer buffer = ByteBuffer.wrap(byteArray);
bitmap_tmp.copyPixelsFromBuffer(buffer);
     */

    fun download_img(url:String):Bitmap?{
        var bmp:Bitmap?=null
        try{
            val ulrn= URL(url)
            val con = ulrn.openConnection() as HttpURLConnection
            val iss=con.inputStream
            bmp= BitmapFactory.decodeStream(iss)

        }catch (ex: Exception){

        }
        return bmp
    }


}