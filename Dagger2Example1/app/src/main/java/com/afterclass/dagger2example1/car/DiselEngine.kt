package com.afterclass.dagger2example1.car

import android.util.Log
import javax.inject.Inject

class DiselEngine : Engine {
    companion object{
        private val TAG = "CAR"
    }
    private var horsepower : Int

    constructor(horsepower: Int) {
        this.horsepower = horsepower
    }


    override fun start() {
        Log.d(TAG,"Disel engine started! and horsepower = $horsepower")
    }
}