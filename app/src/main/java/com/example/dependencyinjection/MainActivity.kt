package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject


class MainActivity : AppCompatActivity() {



    @Inject
     lateinit var mobile :Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //there are three types of manual dependency injection
        //constructor injection , method injection, field injection
        //Dagger dependency injection

        //val  mobile = .create().getMobileInstance()
        //Log.d( "TAGY01",mobile.simCard.getSimNo())


        //create method is used if wew have simple creation of modules
//       DaggerMobileComponent.create().inject(this)
//        mobile.display.turnOnDisplay()

        //if we do not have simple creation of modules then

//        DaggerMobileComponent.builder().lEDDisplayModule(LEDDisplayModule(200)).build().inject(this)
//        mobile.display.turnOnDisplay()
        (application as MobileApplication).mobile.inject(this)





    }
}