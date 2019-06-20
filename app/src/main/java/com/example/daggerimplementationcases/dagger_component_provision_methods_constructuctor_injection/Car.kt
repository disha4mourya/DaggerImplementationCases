package com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun drive() {
        Log.d("Car", "Driving...")
    }
}