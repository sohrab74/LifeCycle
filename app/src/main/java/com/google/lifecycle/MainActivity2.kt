package com.google.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(TAG, "onCreate: 2 ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 2 ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 2 ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 2 ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 2 ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 2 ")
    }
}