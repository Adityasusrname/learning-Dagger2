package com.afterclass.dagger2example1.car

import android.util.Log

class Tires {
    //We don't own this class so we can't annotate it with @Inject
    companion object{
        private val TAG = "CAR"
    }
    fun inflate(){
        Log.d(TAG,"Tires inflated!")
    }
}