package com.example.tranning.network

import com.example.tranning.data.model.RootBreed
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface MainApi{


    @GET("breeds/list/")
    abstract fun getAllDog2(): Observable<RootBreed>


    @GET("breed/{name}/images/random/1")
    abstract fun getImage2(@Path("name") name: String): Observable<RootBreed>

}