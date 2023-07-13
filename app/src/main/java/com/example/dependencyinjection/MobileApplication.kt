package com.example.dependencyinjection

import android.app.Application

class MobileApplication : Application() {

    lateinit var mobile : MobileComponent
    override fun onCreate() {
        mobile = initMobile()
        super.onCreate()

    }

    private fun initMobile ():MobileComponent = DaggerMobileComponent.builder().lEDDisplayModule(LEDDisplayModule(200)).build()



}