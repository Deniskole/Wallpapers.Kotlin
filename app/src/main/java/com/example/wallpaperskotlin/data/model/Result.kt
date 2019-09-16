package com.example.wallpaperskotlin.data.model

import com.example.wallpaperskotlin.util.Constants.ID
import com.example.wallpaperskotlin.util.Constants.URLS
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Result {
    @SerializedName(ID)
    @Expose
    private var id: String? = null

    @SerializedName(URLS)
    @Expose
    private var urls: Urls? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getUrls(): Urls? {
        return urls
    }

    fun setUrls(urls: Urls) {
        this.urls = urls
    }
}