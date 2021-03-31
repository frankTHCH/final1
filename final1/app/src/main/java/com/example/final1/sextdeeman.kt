package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sexmen.*
import kotlinx.android.synthetic.main.activity_sexmen.bmrok1
import kotlinx.android.synthetic.main.activity_sextdeeman.*

class sextdeeman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sextdeeman)
        var d:Double  = 0.00
        var f:Double  = 0.00
        val br = 0
        bmrok2.setOnClickListener {
            if (br==0){
                var a:Double=tdeeng.text.toString().toDouble()
                var b:Double=tdeecm.text.toString().toDouble()
                var c:Double=tdeeyear.text.toString().toDouble()
                var g:Double=tdeenum.text.toString().toDouble()
                a=13.7*a
                b=5.0*b
                c=6.8*c
                d=a+b
                f=d-c
                g=f*g
                tdeev.setText("$g")
            }

            bmrclear3.setOnClickListener {
                tdeeng.setText("")
                tdeecm.setText("")
                tdeeyear.setText("")
                tdeenum.setText("")
            }
        }
        sexblack2.setOnClickListener {
            val it = Intent(this, btnbmr::class.java)
            startActivity(it)
        }
    }
}