package com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection

import com.example.myapplication.DaggerTActivity
import dagger.Component

@Component
interface CarTwoComponent {

    fun inject(daggerTActivity: DaggerTActivity)
}