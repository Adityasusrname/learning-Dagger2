package com.afterclass.dagger2example1

import dagger.Module
import dagger.Provides


@Module
class WheelsModule {
    @Provides
    fun provideRims():Rims{
       return Rims()
    }
    @Provides
    fun provideTires():Tires{
        val Tires = Tires()
        Tires.inflate()
        return  Tires
    }
    @Provides
    fun provideWheels(Rims:Rims,Tires:Tires):Wheels{
          return Wheels(Rims,Tires)
    }
}