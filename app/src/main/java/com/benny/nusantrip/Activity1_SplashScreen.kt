package com.benny.nusantrip

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Activity1_SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1_splashscreen)
        //1. HIDE THE ACTION BAR
        supportActionBar?.hide()
        //2. CREATE SPLASH SCREEN TIME, AND MOVE THE ACTIVITY PAGE USING INTENT
        //CASE :
            //IF USER ALREADY LOGIN, THEN MOVE TO THE HOME PAGE
            //IF USER NOT ALREADY LOGIN, THEN MOVE TO THE ONBOARDING PAGE
        //use looper inside handler to avoid deprecated function
        Handler(Looper.getMainLooper()).postDelayed({
            val menujukeonboarding= Intent(this, Activity2_Onboarding::class.java)
            startActivity(menujukeonboarding)
            finish()
        },3000)
    }
}