package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnbmi.*
import kotlinx.android.synthetic.main.activity_main.*

class btnbmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnbmi)
        var c:Double  = 0.00
        val bi = 0
        bmiok.setOnClickListener {
            if (bi==0){
            var a:Int=bmikg.text.toString().toInt()
            var b:Double=bmim.text.toString().toDouble()
                b = b*b
                c = a / b
            bmiv.setText("$c")
        }
            bmiclear.setOnClickListener {
                bmiv.setText("")
                bmikg.setText("")
                bmim.setText("")
            }

        }
        bmiblack.setOnClickListener {
            val it = Intent(this, MainActivity::class.java)
            startActivity(it)
        }
    }
}