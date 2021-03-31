package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnbmr.*
import kotlinx.android.synthetic.main.activity_btnbmr.sex1
import kotlinx.android.synthetic.main.activity_btntdee.*

class btntdee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btntdee)

        sextdee.setOnClickListener {
            val it = Intent(this, sextdeeman::class.java)
            startActivity(it)
        }
        sextdee1.setOnClickListener {
            val it = Intent(this, sextdeewomen::class.java)
            startActivity(it)
        }
       tdeeblack.setOnClickListener {
            val it = Intent(this, MainActivity::class.java)
            startActivity(it)
        }
    }
}