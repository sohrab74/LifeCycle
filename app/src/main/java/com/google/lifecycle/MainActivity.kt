package com.google.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: 1 ")

        findViewById<Button>(R.id.buttonStartActivity2).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 1 ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 1 ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 1 ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 1 ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 1 ")
    }
}