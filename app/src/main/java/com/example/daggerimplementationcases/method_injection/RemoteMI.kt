package com.example.daggerimplementationcases.method_injection

import android.util.Log
import javax.inject.Inject

class RemoteMI @Inject constructor(){

    fun setListener(carMI: CarMI){
        Log.d("Remote","Connected...")
    }
}