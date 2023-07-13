package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(val display: Display, val battery: Battery, val simCard: SimCard) {

    init {
        display.turnOnDisplay()
        battery.showBatteryPercent()
        Log.d("TAGY",simCard.getSimNo())

        simCard.servideProvider.getSPName()?.let {
            Log.d("TAGY",it)
        }
        fun turnOnDevice(){
            Log.d("TAGY","Device turned ON")
        }
        fun turnOffDevice(){
            Log.d("TAGY","Device turned OFF")
        }
    }
}