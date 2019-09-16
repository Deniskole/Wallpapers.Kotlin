package com.example.wallpaperskotlin.data.model

import com.example.wallpaperskotlin.util.Constants.RESULTS
import com.example.wallpaperskotlin.util.Constants.TOTAL
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Request {

    @SerializedName(TOTAL)
    @Expose
    private var total: Int? = null

    @SerializedName(RESULTS)
    @Expose
    private var results: List<Result>? = null

    fun getTotal(): Int? {
        return total
    }

    fun setTotal(total: Int?) {
        this.total = total
    }

    fun getResults(): List<Result>? {
        return results
    }

    fun setResults(results: List<Result>) {
        this.results = results
    }

}