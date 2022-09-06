package com.afterclass.dagger2example1

import android.util.Log
import javax.inject.Inject

class Car {
    companion object{
       private val TAG:String = "CAR"
    }
   @Inject lateinit var Engine:Engine
    private var Wheels:Wheels?=null

    @Inject
    constructor( Wheels: Wheels?) {
        this.Wheels = Wheels
    }

    @Inject
    fun enableRemote(Remote:Remote){
        Remote.setListener(this)
    }

    fun drive(){
        Log.d(TAG, "driving....")
    }
}