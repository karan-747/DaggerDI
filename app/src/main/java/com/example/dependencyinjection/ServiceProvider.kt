package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject
import kotlin.random.Random

class ServiceProvider @Inject constructor() {

    private  var spName:String? = null
    init {
        val serviceProviderId = Random.nextInt(1, 3)

        when (serviceProviderId) {
            1->{
                Log.d("TAGY", "ServiceProvider is Jio")
                spName = "Jio"
            }
            2->{
                Log.d("TAGY", "ServiceProvider is Airtel")
                spName ="Airtel"
            }
            3->{
                Log.d("TAGY", "ServiceProvider is VI")
                spName = "VI"
            }
        }
    }

    fun getSPName(): String? {
        return spName
    }
}