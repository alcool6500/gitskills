package com.example.activitytest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class ffirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button1 = findViewById<View>(R.id.button_1) as Button
        button1.setOnClickListener {
            Toast.makeText(
                this@ffirstActivity, "我的第一个APP",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}