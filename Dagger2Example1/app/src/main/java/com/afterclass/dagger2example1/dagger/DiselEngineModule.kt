package com.afterclass.dagger2example1.dagger

import com.afterclass.dagger2example1.car.DiselEngine
import com.afterclass.dagger2example1.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DiselEngineModule {
    private var horsepower : Int

    constructor(horsepower: Int) {
        this.horsepower = horsepower
    }

    @Provides
    fun bindEngine(): Engine{
        return DiselEngine(horsepower)
    }
}