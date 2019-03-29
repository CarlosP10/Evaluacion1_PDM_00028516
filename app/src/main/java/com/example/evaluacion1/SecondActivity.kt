package com.example.evaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener{
    override fun onClick(v: View?) {
        val shareintent:Intent = Intent()
        shareintent.action= Intent.ACTION_SEND
        shareintent.type = "text/plain"
        shareintent.putExtra(Intent.EXTRA_TEXT, """
            username: ${tvs_user.text}
            email: ${tvs_email.text}
            total: ${tvs_totalproductos.text}
        """.trimIndent())
        startActivity(shareintent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent:Intent = getIntent()
        mostrar(intent)
        btn_share.setOnClickListener(this)
    }

    private fun mostrar(intent: Intent) {
        tvs_user.text = intent.getStringExtra("name")
        tvs_email.text = intent.getStringExtra("email")
        var total:Int = 0
        for (i in 1..9){
            var cont = intent.getStringExtra("product$i").toInt()
            total = total + cont
        }
        tvs_totalproductos.text = total.toString()
        (btn_product1.getChildAt(1) as TextView).text = intent.getStringExtra("product1")
        (btn_product2.getChildAt(1) as TextView).text = intent.getStringExtra("product2")
        (btn_product3.getChildAt(1) as TextView).text = intent.getStringExtra("product3")
        (btn_product4.getChildAt(1) as TextView).text = intent.getStringExtra("product4")
        (btn_product5.getChildAt(1) as TextView).text = intent.getStringExtra("product5")
        (btn_product6.getChildAt(1) as TextView).text = intent.getStringExtra("product6")
        (btn_product7.getChildAt(1) as TextView).text = intent.getStringExtra("product7")
        (btn_product8.getChildAt(1) as TextView).text = intent.getStringExtra("product8")
        (btn_product9.getChildAt(1) as TextView).text = intent.getStringExtra("product9")
    }
}
