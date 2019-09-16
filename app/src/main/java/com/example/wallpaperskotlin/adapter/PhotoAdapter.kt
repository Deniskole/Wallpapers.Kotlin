package com.example.wallpaperskotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaperskotlin.R
import com.example.wallpaperskotlin.data.model.Result
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_photo.view.*

class PhotoAdapter : RecyclerView.Adapter<ViewHolder>() {

    private var photos: MutableList<Result>? = null
    lateinit var onPhotoClickListener: OnPhotoClickListener
    lateinit var onReachEndListener: OnReachEndListener

    interface OnPhotoClickListener {
        fun onPhotoClick(position: Int)
    }

    interface OnReachEndListener {
        fun onReachEnd()
    }

    fun setPhotos(photos: MutableList<Result>) {
        if (this.photos == null) {
            this.photos = photos
        } else {
            this.photos!!.addAll(photos)
        }
        notifyDataSetChanged()
    }

    fun clear() {
        photos!!.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return photos!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position > photos!!.size - 2 && onReachEndListener != null) {
            onReachEndListener.onReachEnd()
        }
        val photo: Result = photos!![position]
        Picasso.get().load(photo.getUrls()!!.getSmall()).into(holder.imageView)
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val imageView = view.image_view_photo
}