package com.benny.nusantrip

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController

class Activity6_BottomNav : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity6_bottom_navigation)
        val actionBar=supportActionBar
        //change color. adapt with light/dark theme
        //actionbar customization : change color become transparent, because i love transparenn :)
        actionBar?.hide()


        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomnav)
        val navController=findNavController(R.id.nav_fragment)
        bottomNavigationView.setupWithNavController(navController)

//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        bottomNavigationView.setupWithNavController(navController)
    }
}