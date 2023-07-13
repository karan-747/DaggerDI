package com.example.dependencyinjection

import dagger.Module
import dagger.Provides


@Module
class LEDDisplayModule (var resolution:Int){

    @Provides
    fun provideLEDDisplay():Display{
        return LEDDisplay()
    }
}