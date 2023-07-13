package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class MainActivity : AppCompatActivity() {

    //private lateinit var mobile :Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //there are three types of manual dependency injection
        //constructor injection , method injection, field injection
        //Dagger dependency injection

        //val  mobile = .create().getMobileInstance()
        //Log.d( "TAGY01",mobile.simCard.getSimNo())
        val mobile = DaggerMobileComponent.builder().build().getMobileInstance()
        mobile.display.turnOnDisplay()




    }
}