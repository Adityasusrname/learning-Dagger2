package com.afterclass.dagger2example1

import android.util.Log
import javax.inject.Inject

class DiselEngine : Engine {
    companion object{
        private val TAG = "CAR"
    }
    @Inject
    constructor(){

    }
    override fun start() {
        Log.d(TAG,"Disel engine started!")
    }
}