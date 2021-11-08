package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lotteryNumbers = arrayListOf(number1, number2, number3, number4, number5, number6)

        lotteryButton.setOnClickListener {
            lotteryButton.playAnimation()
            lotteryNumbers.forEach {
                val randomNumber = (Math.random() * 45 + 1).toInt()
                it.text = "${randomNumber}"
            }
        }
    }
}