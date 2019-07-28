package com.example.daggerimplementationcases.providing_interface

import android.util.Log
import javax.inject.Inject

class CarPI @Inject constructor( var enginePI: EnginePI,  var wheelsPI: WheelsPI) {

    fun drive() {
        enginePI.start()
        Log.d("Driving", "Start.. ")
    }
}