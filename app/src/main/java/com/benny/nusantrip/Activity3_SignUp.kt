package com.benny.nusantrip

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class Activity3_SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //navigasi tombol
        setContentView(R.layout.activity_activity3_sign_up)

        val tes=findViewById<Button>(R.id.registrasi)
        tes.setOnClickListener(View.OnClickListener {
            val menujubottomnav=Intent(this, Activity5_BiodataUser::class.java)
            startActivity(menujubottomnav)
        })

        //create actionbar variable
        val actionBar=supportActionBar
        //change color. adapt with light/dark theme
        //actionbar customization : change color become transparent, because i love transparenn :)
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //actionbar customization : add left arrow
        actionBar?.elevation=0f
        if(actionBar!=null){
            actionBar.setHomeAsUpIndicator(R.drawable.arrowleft)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        //actionbar customization : hide text
        actionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}