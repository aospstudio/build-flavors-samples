package com.aospstudio.sample.buildflavors

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import com.aospstudio.sample.buildflavors.R

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        textView!!.text = "Google Play Free variant"
    }
}
