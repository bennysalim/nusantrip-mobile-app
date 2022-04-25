package com.benny.nusantrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class Activity3_SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3_sign_up)
        val tes=findViewById<Button>(R.id.registrasi)

        val actionBar=supportActionBar
        actionBar?.elevation=0f
        if(actionBar!=null){
            actionBar.setHomeAsUpIndicator(R.drawable.arrowleft)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        tes.setOnClickListener(View.OnClickListener {
            val menujubottomnav=Intent(this, Activity6_BottomNav::class.java)
            startActivity(menujubottomnav)
        })
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