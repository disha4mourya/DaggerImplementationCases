package com.example.daggerimplementationcases.without_dagger

import android.util.Log
import com.example.daggerimplementationcases.without_dagger.engine.Engine
import com.example.daggerimplementationcases.without_dagger.wheels.Wheels

class Car {

    private var engine: Engine
    private var wheels: Wheels

    constructor(engine: Engine, wheels: Wheels) {
        this.engine=engine
        this.wheels=wheels
    }

    fun drive() {
        Log.d("CarTwo", "driving")
    }
}