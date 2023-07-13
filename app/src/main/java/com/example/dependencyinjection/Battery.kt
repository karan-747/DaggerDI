package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject



//consider the battery class to be 3rd party class
//we cant touch the constructor of the class

class Battery @Inject constructor(){

    init {
        Log.d("TAGY", "Battery created successfully")
    }
    fun showBatteryPercent(){
        Log.d("TAGY", "Battery is at 100%")
    }

}