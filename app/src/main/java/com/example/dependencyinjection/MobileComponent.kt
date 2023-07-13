package com.example.dependencyinjection

import dagger.Component


@Component
interface MobileComponent {


    //in the interface include the dependent not the dependencies

    fun getMobileInstance ():Mobile


}