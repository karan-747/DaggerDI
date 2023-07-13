package com.example.dependencyinjection

import dagger.Component


@Component(modules = [BatteryModule::class,LEDDisplayModule::class])
interface MobileComponent {


    //in the interface include the dependent not the dependencies

   //fun getMobileInstance ():Mobile
    //if there are many classes on which my activity depends we use field injection

    fun inject(mainActivity: MainActivity)



}