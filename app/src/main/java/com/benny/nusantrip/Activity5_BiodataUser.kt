package com.benny.nusantrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Activity5_BiodataUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity5_biodata_user)
        val actionBar=supportActionBar
        actionBar?.hide()
        val btnMulaiPerjalanan=findViewById<Button>(R.id.btnMulaiPerjalanan)
        btnMulaiPerjalanan.setOnClickListener(View.OnClickListener {
            val mulaiperjalanan= Intent(this, Activity6_BottomNav::class.java)
            startActivity(mulaiperjalanan)
        })
    }
}