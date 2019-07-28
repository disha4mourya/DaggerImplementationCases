package com.example.daggerimplementationcases.providing_interface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerimplementationcases.R
import javax.inject.Inject

class DaggerPIActivity : AppCompatActivity() {

    @Inject
    lateinit var carPI: CarPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_pi)

        val carComponent=DaggerCarPIComponent.create()
        carComponent.inject(this)

        carPI.drive()
    }
}
