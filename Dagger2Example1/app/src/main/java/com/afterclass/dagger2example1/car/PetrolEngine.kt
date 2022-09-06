package com.afterclass.dagger2example1.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine : Engine {
    companion object{
        private val TAG = "CAR"
    }
    @Inject
    constructor(){

    }
    override fun start() {
        Log.d(TAG,"Petrol engine started!")
    }
}