package com.example.daggerimplementationcases.providing_interface

import dagger.Component

@Component(modules = [DieselEngineModule::class])
interface CarPIComponent {

    fun inject(daggerPIActivity: DaggerPIActivity)
}