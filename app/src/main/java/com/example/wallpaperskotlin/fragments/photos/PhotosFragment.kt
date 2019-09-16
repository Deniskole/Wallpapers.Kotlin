package com.example.wallpaperskotlin.fragments.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wallpaperskotlin.R
import com.example.wallpaperskotlin.adapter.PhotoAdapter
import com.example.wallpaperskotlin.fragments.photo.PhotoViewFragment

class PhotosFragment : Fragment() {
    companion object {
        val TAG = "PhotosFragment"
    }

    private var adapder: PhotoAdapter? = null
    private var pageCounter = 1
    private val isLoading = false
    private var isSearch = false
    private var photoViewFragment: PhotoViewFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}