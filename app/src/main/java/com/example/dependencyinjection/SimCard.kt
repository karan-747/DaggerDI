package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(val servideProvider: ServiceProvider) {

    init{
        Log.d("TAGY","Simcard of ${servideProvider.getSPName()} is created")
    }
    fun getSimNo() :String{
        return "9191991919"
    }
}