package com.afterclass.dagger2example1

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
}