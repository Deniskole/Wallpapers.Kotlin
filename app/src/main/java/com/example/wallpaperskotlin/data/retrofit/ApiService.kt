package com.example.wallpaperskotlin.data.retrofit

import com.example.wallpaperskotlin.data.model.Request
import com.example.wallpaperskotlin.data.model.Result
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("photos/")
    abstract fun getPhotos(@QueryMap params: Map<String, String>): Observable<List<Result>>

    @GET("search/photos/")
    abstract fun getSearchPhotos(@QueryMap params: Map<String, String>): Observable<Request>
}