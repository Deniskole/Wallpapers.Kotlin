package com.example.wallpaperskotlin.data.model

import com.example.wallpaperskotlin.util.Constants.REGULAR
import com.example.wallpaperskotlin.util.Constants.SMALL
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Urls {
    @SerializedName(REGULAR)
    @Expose
    private var regular: String? = null
    @SerializedName(SMALL)
    @Expose
    private var small: String? = null

    fun getRegular(): String? {
        return regular
    }

    fun setRegular(regular: String) {
        this.regular = regular
    }

    fun getSmall(): String? {
        return small
    }

    fun setSmall(small: String) {
        this.small = small
    }
}