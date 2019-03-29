package com.example.evaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter1 = 0
    private var counter1Key = "insideCounter1"
    private var counter2 = 0
    private var counter2Key = "insideCounter1"
    private var counter3 = 0
    private var counter3Key = "insideCounter1"
    private var counter4 = 0
    private var counter4Key = "insideCounter1"
    private var counter5 = 0
    private var counter5Key = "insideCounter1"
    private var counter6 = 0
    private var counter6Key = "insideCounter1"
    private var counter7 = 0
    private var counter7Key = "insideCounter1"
    private var counter8 = 0
    private var counter8Key = "insideCounter1"
    private var counter9 = 0
    private var counter9Key = "insideCounter1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            restoreCounters(savedInstanceState)
        }

        addEventListener()

        var intent : Intent = Intent(this, SecondActivity::class.java)


    }

    private fun restoreCounters(savedInstanceState: Bundle) {

        counter1 = savedInstanceState.getInt(counter1Key)
        counter2 = savedInstanceState.getInt(counter2Key)
        counter3 = savedInstanceState.getInt(counter3Key)
        counter4 = savedInstanceState.getInt(counter4Key)
        counter5 = savedInstanceState.getInt(counter5Key)
        counter6 = savedInstanceState.getInt(counter6Key)
        counter7 = savedInstanceState.getInt(counter7Key)
        counter8 = savedInstanceState.getInt(counter8Key)
        counter9 = savedInstanceState.getInt(counter9Key)

        btn_result1.text = counter1.toString()
        btn_result2.text = counter2.toString()
        btn_result3.text = counter3.toString()
        btn_result4.text = counter4.toString()
        btn_result5.text = counter5.toString()
        btn_result6.text = counter6.toString()
        btn_result7.text = counter7.toString()
        btn_result8.text = counter8.toString()
        btn_result9.text = counter9.toString()

    }

    private fun addEventListener() {

        btn_product1.setOnClickListener {
            counter1++
            btn_result1.text = counter1.toString()
        }

        btn_product2.setOnClickListener {
            counter2++
            btn_result2.text = counter2.toString()
        }

        btn_product3.setOnClickListener {
            counter3++
            btn_result3.text = counter3.toString()
        }

        btn_product4.setOnClickListener {
            counter4++
            btn_result4.text = counter4.toString()
        }

        btn_product5.setOnClickListener {
            counter5++
            btn_result5.text = counter5.toString()
        }

        btn_product6.setOnClickListener {
            counter6++
            btn_result6.text = counter6.toString()
        }

        btn_product7.setOnClickListener {
            counter7++
            btn_result7.text = counter7.toString()
        }

        btn_product8.setOnClickListener {
            counter8++
            btn_result8.text = counter8.toString()
        }

        btn_product9.setOnClickListener {
            counter9++
            btn_result9.text = counter9.toString()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(counter1Key, counter1)
        outState.putInt(counter2Key, counter2)
        outState.putInt(counter3Key, counter3)
        outState.putInt(counter4Key, counter4)
        outState.putInt(counter5Key, counter5)
        outState.putInt(counter6Key, counter6)
        outState.putInt(counter7Key, counter7)
        outState.putInt(counter8Key, counter8)
        outState.putInt(counter9Key, counter9)
    }
}
