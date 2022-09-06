package com.afterclass.dagger2example1

import dagger.Binds
import dagger.Module

@Module
abstract class DiselEngineModule {
    @Binds
    abstract fun bindEngine(DiselEngine:DiselEngine):Engine
}