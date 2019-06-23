package com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection

import android.util.Log
import javax.inject.Inject

class CarTwo @Inject constructor(var engine: EngineTwo, var wheels: Wheels) {

    fun drive() {
        Log.d("CarTwo", "Driving...")
    }
}