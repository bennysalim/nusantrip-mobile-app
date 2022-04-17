package com.benny.nusantrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity2_Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2_onboarding)
        supportActionBar?.hide()
        val btnSignUp=findViewById<Button>(R.id.btnSignUpDariOnboarding)
        val btnSignIn=findViewById<Button>(R.id.btnSignInDariOnboarding)

        btnSignUp.setOnClickListener(View.OnClickListener {
            val kesignup=Intent(this, Activity3_SignUp::class.java)
            startActivity(kesignup)
        })
        btnSignIn.setOnClickListener(View.OnClickListener {
            val kesignin=Intent(this, Activity4_SignIn::class.java)
            startActivity(kesignin)
        })
    }
}
