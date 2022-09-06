package com.afterclass.dagger2example1.dagger

import com.afterclass.dagger2example1.car.Rims
import com.afterclass.dagger2example1.car.Tires
import com.afterclass.dagger2example1.car.Wheels
import dagger.Module
import dagger.Provides


@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
       return Rims()
    }
    @Provides
    fun provideTires(): Tires {
        val Tires = Tires()
        Tires.inflate()
        return  Tires
    }
    @Provides
    fun provideWheels(Rims: Rims, Tires: Tires): Wheels {
          return Wheels(Rims,Tires)
    }
}