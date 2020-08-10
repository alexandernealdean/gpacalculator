package com.bignerdranch.android.photogallery

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

//Class that creates a new photogalleryfragment object
class PhotoGalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_gallery)

        //Setting the actionbar and enabling a back button
        val actionbar = supportActionBar
        actionbar!!.title = "Profile Picture"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        //Initializing the photo gallery fragment
        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
                .commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}
