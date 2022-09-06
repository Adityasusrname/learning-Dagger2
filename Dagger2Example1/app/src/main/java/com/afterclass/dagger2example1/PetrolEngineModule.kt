package com.afterclass.dagger2example1

import dagger.Binds
import dagger.Module


@Module
abstract class PetrolEngineModule {
    @Binds
   abstract fun bindEngine(PetrolEngine:PetrolEngine):Engine
}