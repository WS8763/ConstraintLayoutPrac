package com.example.constraintlayoutprac

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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

        val redButton = findViewById<Button>(R.id.button1)
        val greenButton = findViewById<Button>(R.id.button2)
        val yellowButton = findViewById<Button>(R.id.button3)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,redButton,greenButton,yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when (view.id) {
            R.id.box1 -> view.setBackgroundColor(Color.YELLOW)
            R.id.box2 -> view.setBackgroundColor(Color.CYAN)
            R.id.box3 -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box4 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box5 -> view.setBackgroundColor(Color.RED)
            // Boxes using custom colors for background
            R.id.button1 -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.button2 ->  view.setBackgroundResource(R.color.my_yellow)
            R.id.button3 ->  view.setBackgroundResource(R.color.my_green)


            else -> view.setBackgroundColor(Color.BLACK)
        }
    }
}