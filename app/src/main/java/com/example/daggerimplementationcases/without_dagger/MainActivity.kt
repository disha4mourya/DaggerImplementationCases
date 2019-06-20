package com.example.daggerimplementationcases.without_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerimplementationcases.R
import com.example.daggerimplementationcases.without_dagger.engine.Engine
import com.example.daggerimplementationcases.without_dagger.wheels.Wheels
import com.example.daggerimplementationcases.without_dagger.engine.Block
import com.example.daggerimplementationcases.without_dagger.engine.Cylinder
import com.example.daggerimplementationcases.without_dagger.engine.SparkPlugs
import com.example.daggerimplementationcases.without_dagger.wheels.Rims
import com.example.daggerimplementationcases.without_dagger.wheels.Tires

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val block = Block()
        val cylinder = Cylinder()
        val sparkPlugs = SparkPlugs()

        val rims = Rims()
        val tires = Tires()
        val engine = Engine(block, cylinder, sparkPlugs)
        val wheels = Wheels(tires, rims)

        val car = Car(engine, wheels)
        car.drive()
    }
}
