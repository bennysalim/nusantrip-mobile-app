package com.benny.nusantrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class Activity3_SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3_sign_up)
        val actionBar=supportActionBar
        actionBar?.elevation=0f
        if(actionBar!=null){
            actionBar.setHomeAsUpIndicator(R.drawable.arrowleft)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
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