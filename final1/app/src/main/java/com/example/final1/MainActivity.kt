package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bmi.setOnClickListener {
            val it = Intent(this, btnbmi::class.java)
            startActivity(it)
        }
        bmr.setOnClickListener {
            val it = Intent(this, btnbmr::class.java)
            startActivity(it)
        }
        tdee.setOnClickListener {
            val it = Intent(this, btntdee::class.java)
            startActivity(it)
        }
    }
}