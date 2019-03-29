package com.example.evaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener{
    override fun onClick(v: View?) {
        if(v!!.equals(btn_enviar)){
            enviardatos()
        }
        else{
            var view = v as LinearLayout
            var counter = view.getChildAt(1) as TextView
            if(counter.text.toString().equals("#"))
                counter.text = "1"
            else {
                var newNumber = counter.text.toString().toInt()+1
                counter.text = newNumber.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_product1.setOnClickListener(this)
        btn_product2.setOnClickListener(this)
        btn_product3.setOnClickListener(this)
        btn_product4.setOnClickListener(this)
        btn_product5.setOnClickListener(this)
        btn_product6.setOnClickListener(this)
        btn_product7.setOnClickListener(this)
        btn_product8.setOnClickListener(this)
        btn_product9.setOnClickListener(this)

        btn_enviar.setOnClickListener(this)
    }

    private fun enviardatos() {
        var intent:Intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", et_user.text.toString())
        intent.putExtra("email", et_email.text.toString())
        intent.putExtra("product1", if((btn_product1.getChildAt(1)as TextView).text.toString() == "#") "0" else (btn_product1.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product2", (btn_product2.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product3", (btn_product3.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product4", (btn_product4.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product5", (btn_product5.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product6", (btn_product6.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product7", (btn_product7.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product8", (btn_product8.getChildAt(1)as TextView).text.toString())
        intent.putExtra("product9", (btn_product9.getChildAt(1)as TextView).text.toString())

        startActivity(intent)
    }




}
