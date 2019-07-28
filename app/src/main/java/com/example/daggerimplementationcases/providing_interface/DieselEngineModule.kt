package com.example.daggerimplementationcases.providing_interface

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsEngine(dieselEngine: DieselEngine):EnginePI
}