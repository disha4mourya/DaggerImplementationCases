package com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerimplementationcases.R

class DaggerOActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_o)

        val carComponent = DaggerCarComponent.create()

        car = carComponent.getCar()
        car.drive()
    }
}
