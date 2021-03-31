package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnbmi.*
import kotlinx.android.synthetic.main.activity_btnbmr.*
import kotlinx.android.synthetic.main.activity_main.*

class btnbmr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnbmr)

        sex1.setOnClickListener {
            val it = Intent(this, sexmen::class.java)
            startActivity(it)
        }
        sex2.setOnClickListener {
            val it = Intent(this, sexwomen::class.java)
            startActivity(it)
        }
        bmrblack.setOnClickListener {
            val it = Intent(this, MainActivity::class.java)
            startActivity(it)
        }
    }
}