package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerimplementationcases.R
import com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection.CarTwo
import com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection.DaggerCarTwoComponent
import javax.inject.Inject

class DaggerTActivity : AppCompatActivity() {

    @Inject
    lateinit var carTwo: CarTwo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarTwoComponent.create()
        carComponent.inject(this)
        carTwo.drive()
    }
}
