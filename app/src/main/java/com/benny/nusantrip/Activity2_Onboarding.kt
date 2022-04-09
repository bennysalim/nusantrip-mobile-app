package com.benny.nusantrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2_Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2_onboarding)
        supportActionBar?.hide()
    }
}