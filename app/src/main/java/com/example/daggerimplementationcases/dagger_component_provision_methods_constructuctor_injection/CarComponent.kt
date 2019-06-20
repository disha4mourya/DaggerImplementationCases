package com.example.daggerimplementationcases.dagger_component_provision_methods_constructuctor_injection

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}