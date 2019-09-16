package com.example.wallpaperskotlin.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.wallpaperskotlin.util.Constants.ID
import com.example.wallpaperskotlin.util.Constants.TABLE_NAME
import com.example.wallpaperskotlin.util.Constants.URLS
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = TABLE_NAME)
//@TypeConverters(value = Conventer::class)
class Result {

    @PrimaryKey(autoGenerate = true)
    private var id_primary: Int = 0

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

    fun getId_primary(): Int {
        return id_primary
    }

    fun setId_primary(id_primary: Int) {
        this.id_primary = id_primary
    }

}