package com.afterclass.dagger2example1.car

import com.afterclass.dagger2example1.dagger.DiselEngineModule
import com.afterclass.dagger2example1.MainActivity
import com.afterclass.dagger2example1.dagger.WheelsModule
import dagger.Component

@Component (modules = [WheelsModule::class, DiselEngineModule::class])
interface CarComponent {
    //fun getCar():Car
    fun inject(MainActivity: MainActivity) //If later we have to inject in some other activity then we need another inject function

}