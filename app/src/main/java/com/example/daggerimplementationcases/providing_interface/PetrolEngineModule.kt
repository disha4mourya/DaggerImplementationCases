package com.example.daggerimplementationcases.providing_interface

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {


    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine):EnginePI
}