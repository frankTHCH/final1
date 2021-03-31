package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sextdeeman.*
import kotlinx.android.synthetic.main.activity_sextdeewomen.*

class sextdeewomen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sextdeewomen)
        var d:Double  = 0.00
        var f:Double  = 0.00
        val br = 0
        bmrok3.setOnClickListener {
            if (br==0){
                var a:Double=tdeeng2.text.toString().toDouble()
                var b:Double=tdeecm2.text.toString().toDouble()
                var c:Double=tdeeyear4.text.toString().toDouble()
                var g:Double=tdeenum2.text.toString().toDouble()
                a=9.6*a
                b=1.8*b
                c=4.7*c
                d=a+b
                f=d-c
                g=f*g
                tdeev2.setText("$g")
            }

            bmrclear4.setOnClickListener {
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
