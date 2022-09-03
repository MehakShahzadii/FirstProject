package com.androidproject1.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class insert_img : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_img)

    }
}


































/*
package com.androidproject1.firstproject

import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.androidproject1.firstproject.databinding.ActivityMainBinding
import com.karumi.dexter.Dexter
import com.karumi.dexter.DexterBuilder
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import kotlinx.android.synthetic.main.activity_insert_img.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class insert_img : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
private val cameraRequestcode=1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


            Camerabtn.setOnClickListener {
            cameracheckpermission()

        }

    }

    private fun cameracheckpermission() {
        Dexter.withContext(this)
            .withPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE
            ).withListener()
                object:MultiplePermissionsListener  {
                    override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                        TODO("Not yet implemented")
                    }

                    override fun onPermissionRationaleShouldBeShown(p0: MutableList<PermissionRequest>?, p1: PermissionToken?) {
                        TODO("Not yet implemented")
                    }
                }
            }

    }

private fun DexterBuilder.SinglePermissionListener.withListener() {
    TODO("Not yet implemented")
}*/