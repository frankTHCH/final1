package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnbmr.*
import kotlinx.android.synthetic.main.activity_sexmen.*

class sexmen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexmen)

        var d:Double  = 0.00
        var f:Double  = 0.00
        val br = 0
        bmrok1.setOnClickListener {
            if (br==0){
                var a:Double=bmrng.text.toString().toDouble()
                var b:Double=bmrcm.text.toString().toDouble()
                var c:Double=bmryear.text.toString().toDouble()
                a=13.7*a
                b=5.0*b
                c=6.8*c
                d=a+b
                f=d-c

                bmrv.setText("$f")
            }
            bmrclear.setOnClickListener {
                bmrv.setText("")
                bmrng.setText("")
                bmrcm.setText("")
                bmryear.setText("")
            }
        }
        sexblack1.setOnClickListener {
            val it = Intent(this, btnbmr::class.java)
            startActivity(it)
        }
    }
}