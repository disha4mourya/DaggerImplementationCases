package com.example.daggerimplementationcases.modules_providers

import dagger.Module
import dagger.Provides

@Module
class WheelsMPModules {

        @Provides
        fun provideRims(): RimsMP {
            return RimsMP()
        }


        @Provides
        fun providesTires(): TiresMP {
            val tiresMP=TiresMP()
            tiresMP.inflate()
            return tiresMP
        }

        @Provides
        fun providesWheels(rimsMP: RimsMP, tiresMP: TiresMP): WheelsMP {
            return WheelsMP(rimsMP, tiresMP)
        }

}