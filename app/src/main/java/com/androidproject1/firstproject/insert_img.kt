package com.androidproject1.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_insert_img.*
import java.util.jar.Attributes


class insert_img : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView


    companion object{
        val IMAGE_REQUEST_CODE=100

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_img)

        val userName=intent.getStringExtra("Name")
        namedisplay.text=userName
        val useremail=intent.getStringExtra("email")
        emaildisplay.text=useremail
        val userpassword=intent.getStringExtra("Password")
        passworddisplay.text=userpassword



        button=findViewById(R.id.Gallerybtn)
        imageView=findViewById(R.id.myimg)
        button.setOnClickListener(){
            pickImageFromGallery()
        }
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            imageView.setImageURI(data?.data)
        }}
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