package com.example.helloworldno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        // Reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle tap button
            Log.i("Fernando", "Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
    }
}