package com.afterclass.dagger2example1.dagger

import com.afterclass.dagger2example1.car.DiselEngine
import com.afterclass.dagger2example1.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DiselEngineModule {
    @Binds
    abstract fun bindEngine(DiselEngine: DiselEngine): Engine
}