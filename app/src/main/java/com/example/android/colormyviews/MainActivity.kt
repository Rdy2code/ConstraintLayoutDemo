package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var boxOneText: TextView
    private lateinit var boxTwoText: TextView
    private lateinit var boxThreeText: TextView
    private lateinit var boxFourText: TextView
    private lateinit var boxFiveText: TextView
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var redButton: Button
    private lateinit var greenButton: Button
    private lateinit var yellowButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        boxOneText = findViewById(R.id.box_one_text)
        boxTwoText = findViewById(R.id.box_two_text)
        boxThreeText = findViewById(R.id.box_three_text)
        boxFourText = findViewById(R.id.box_four_text)
        boxFiveText = findViewById(R.id.box_five_text)
        constraintLayout = findViewById(R.id.constrain_layout)
        redButton = findViewById(R.id.red_button)
        greenButton = findViewById(R.id.green_button)
        yellowButton = findViewById(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, constraintLayout,
            redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }

    //Use setBackgroundResource() to set an image instead of a color or to use an asset from the
    //resources folder
    private fun makeColored (view: View) {
        when (view.id) {
            //R.id.box_one_text -> {setView(view)}
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setView(view: View) {
        //Set the background to an image and remove the text
        view.setBackgroundResource(R.drawable.box_one_drawable)
        val textView: TextView = view as TextView
        textView.text = ""
    }
}