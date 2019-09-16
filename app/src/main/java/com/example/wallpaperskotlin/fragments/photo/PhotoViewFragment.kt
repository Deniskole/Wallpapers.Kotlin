package com.example.wallpaperskotlin.fragments.photo

import android.os.Bundle
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.wallpaperskotlin.R
import com.example.wallpaperskotlin.util.Utils.showToast

class PhotoViewFragment : Fragment() {
    companion object {
        val TAG = "PhotoViewFragment"
        val PHOTO_URL = "photo_url"
    }

    private val manager: FragmentManager? = null
    private val transaction: FragmentTransaction? = null
    private var vibe: Vibrator? = null
    private var photoUrl: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_photo_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun showError() {activity?.let { showToast(it,"Error")}}
    fun showCompleted() {activity?.let { showToast(it,"Image saved to gallery")}}
    fun showLoading() {activity?.let { showToast(it,"Loading")}}

    override fun onDestroy() {
        super.onDestroy()
    }
}