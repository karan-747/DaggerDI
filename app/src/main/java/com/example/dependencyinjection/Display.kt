package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Display  @Inject constructor(){

    init{
        Log.d("TAGY","Display created successfully")

    }

    fun turnOnDisplay(){
        Log.d("TAGY","Display turned on successfully")
    }
}