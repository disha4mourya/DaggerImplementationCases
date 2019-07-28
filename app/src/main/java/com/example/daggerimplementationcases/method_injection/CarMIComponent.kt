package com.example.daggerimplementationcases.method_injection

import dagger.Component

@Component
interface CarMIComponent{

    fun inject(daggerMIActivity: DaggerMIActivity)
}