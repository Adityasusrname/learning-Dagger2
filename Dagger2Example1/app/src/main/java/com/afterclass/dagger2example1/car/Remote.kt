package com.afterclass.dagger2example1.car

import android.util.Log
import javax.inject.Inject

class Remote {

    companion object{
        private val TAG = "Car"
    }

    @Inject
    constructor(){

    }
    fun setListener(Car: Car){
        Log.d(TAG,"Remote connected")
    }

}