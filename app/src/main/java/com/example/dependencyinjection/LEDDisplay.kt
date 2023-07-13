package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class LEDDisplay @Inject constructor() :Display{
    override fun turnOnDisplay() {
        Log.d("TAGY","LED Display turned on successfully")
    }
}