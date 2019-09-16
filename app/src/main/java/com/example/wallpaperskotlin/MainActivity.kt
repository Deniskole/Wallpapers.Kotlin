package com.example.wallpaperskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.wallpaperskotlin.fragments.photos.PhotosFragment
import com.example.wallpaperskotlin.util.Utils

class MainActivity : AppCompatActivity() {
    private lateinit var manager: FragmentManager
    private lateinit var transaction: FragmentTransaction
    private lateinit var photosFragment: PhotosFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utils.verifyStoragePermissions(this)

        photosFragment = PhotosFragment()
        manager = supportFragmentManager
        transaction = manager.beginTransaction()
        if (manager.findFragmentByTag(PhotosFragment.TAG) == null) {
            transaction.add(R.id.frame_layout_container, photosFragment, PhotosFragment.TAG)
        }
        transaction.commit()
    }
}
