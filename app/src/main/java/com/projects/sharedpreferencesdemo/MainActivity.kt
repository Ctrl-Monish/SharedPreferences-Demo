package com.projects.sharedpreferencesdemo

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spref = getPreferences(Context.MODE_PRIVATE)
        var colour = spref.getInt("Colour", Color.WHITE)
        llBackground.setBackgroundColor(colour)


        fun saveColour(colour : Int){
            var editor = spref.edit()
            editor.putInt("Colour", colour)
            editor.apply()
        }


        btn_red.setOnClickListener {
            llBackground.setBackgroundColor(Color.RED)
            saveColour(Color.RED)
        }
        btn_blue.setOnClickListener {
            llBackground.setBackgroundColor(Color.BLUE)
            saveColour(Color.BLUE)
        }
        btn_green.setOnClickListener {
            llBackground.setBackgroundColor(Color.GREEN)
            saveColour(Color.GREEN)
        }
    }
}