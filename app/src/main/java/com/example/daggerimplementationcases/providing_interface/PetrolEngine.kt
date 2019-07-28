package com.example.daggerimplementationcases.providing_interface

import android.util.Log
import javax.inject.Inject

class PetrolEngine  @Inject constructor():EnginePI {
    override fun start() {
        Log.d("PetrolEngine","Start")
    }

}