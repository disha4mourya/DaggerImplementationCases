package com.example.daggerimplementationcases.method_injection

import android.util.Log
import javax.inject.Inject

class CarMI @Inject constructor(engineMI: EngineMI,wheelsMI: WheelsMI){

    fun drive(){
        Log.d("driving","Start...")
    }

    @Inject
    fun enableRemote(remoteMI: RemoteMI){
        remoteMI.setListener(this)
    }
}