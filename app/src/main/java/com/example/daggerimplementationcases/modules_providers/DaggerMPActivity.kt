package com.example.daggerimplementationcases.modules_providers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerimplementationcases.R
import javax.inject.Inject

class DaggerMPActivity : AppCompatActivity() {

    @Inject lateinit var carMP: CarMP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_mp)


        var daggerComponent=DaggerCarMPComponent.create()
        daggerComponent.inject(this)
        carMP.drive()
    }
}
