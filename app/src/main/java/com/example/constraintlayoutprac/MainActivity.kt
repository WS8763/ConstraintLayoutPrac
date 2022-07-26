package com.example.constraintlayoutprac

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box1)
        val boxTwoText: TextView = findViewById(R.id.box2)
        val boxThreeText = findViewById<TextView>(R.id.box3)
        val boxFourText = findViewById<TextView>(R.id.box4)
        val boxFiveText = findViewById<TextView>(R.id.box5)


        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when (view.id) {
            R.id.box1 ->view.setBackgroundColor(Color.YELLOW)
            R.id.box2 ->view.setBackgroundColor(Color.CYAN)
            R.id.box3 ->view.setBackgroundColor(Color.LTGRAY)
            R.id.box4 ->view.setBackgroundColor(Color.MAGENTA)
            R.id.box5 ->view.setBackgroundColor(Color.RED)
            else -> view.setBackgroundColor(Color.BLACK)
        }
    }
}