package com.example.daggerimplementationcases.modules_providers

import android.util.Log
import com.example.daggerimplementationcases.method_injection.EngineMI
import javax.inject.Inject

class CarMP @Inject constructor(engineMP: EngineMP,wheelsMP: WheelsMP){

    fun  drive(){
        Log.d("Driving","Starting...")
    }
}