package com.example.daggerimplementationcases.method_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerimplementationcases.R
import javax.inject.Inject

class DaggerMIActivity : AppCompatActivity() {

    @Inject
    lateinit var carMI: CarMI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_mi2)

        var carMIComponent=DaggerCarMIComponent.create()
        carMIComponent.inject(this)
        carMI.drive()
    }
}
