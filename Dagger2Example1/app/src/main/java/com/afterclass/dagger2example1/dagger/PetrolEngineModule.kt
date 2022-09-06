package com.afterclass.dagger2example1.dagger

import com.afterclass.dagger2example1.car.Engine
import com.afterclass.dagger2example1.car.PetrolEngine
import dagger.Binds
import dagger.Module


@Module
abstract class PetrolEngineModule {
    @Binds
   abstract fun bindEngine(PetrolEngine: PetrolEngine): Engine
}