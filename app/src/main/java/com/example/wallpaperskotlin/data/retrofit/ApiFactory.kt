package com.example.wallpaperskotlin.data.retrofit

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiFactory() {
    private var apiFactory: ApiFactory? = null
    private var retrofit: Retrofit
    private val BASE_URL = "https://api.unsplash.com/"

    init {
        retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    fun getInstance(): ApiFactory {
        if (apiFactory == null) {
            apiFactory = ApiFactory()
        }
        return apiFactory as ApiFactory
    }

    fun getApiService(): ApiService {
        return retrofit.create<ApiService>(ApiService::class.java!!)
    }
}

