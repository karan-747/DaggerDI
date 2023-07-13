package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init {
        Log.d("TAGY", "Battery created successfully")
    }
    fun showBatteryPercent(){
        Log.d("TAGY", "Battery is at 100%")
    }

}