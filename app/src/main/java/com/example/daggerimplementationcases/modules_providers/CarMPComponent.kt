package com.example.daggerimplementationcases.modules_providers

import dagger.Component

@Component(modules = [WheelsMPModules::class])
interface CarMPComponent {

    fun inject(daggerMPActivity: DaggerMPActivity)
}