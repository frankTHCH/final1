package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sexmen.*
import kotlinx.android.synthetic.main.activity_sexmen.bmrok1
import kotlinx.android.synthetic.main.activity_sexwomen.*

class sexwomen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexwomen)
        var d:Double  = 0.00
        var f:Double  = 0.00
        val br = 0
        bmrok.setOnClickListener {
            if (br==0){
                var a:Double=bmrng2.text.toString().toDouble()
                var b:Double=bmrcm2.text.toString().toDouble()
                var c:Double=bmryear2.text.toString().toDouble()
                a=9.6*a
                b=1.8*b
                c=4.7*c
                d=a+b
                f=d-c

                bmrv2.setText("$f")
            }
            bmrclear2.setOnClickListener {
                bmrv2.setText("")
                bmrng2.setText("")
                bmrcm2.setText("")
                bmryear2.setText("")
            }
        }
        sexblack.setOnClickListener {
            val it = Intent(this, btnbmr::class.java)
            startActivity(it)
        }
    }
}