package com.androidproject1.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

    Handler().postDelayed(
    {
        movetoMainActivity()
    },
    3000
    )

}
private fun movetoMainActivity() {
    startActivity(Intent(this, MainActivity::class.java))
}
}
