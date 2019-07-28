package com.example.daggerimplementationcases.providing_interface

import android.util.Log
import javax.inject.Inject

class DieselEngine  @Inject constructor() :EnginePI{
    override fun start() {
        Log.d("DieselEngine","Start")
    }

}