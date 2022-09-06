package com.afterclass.dagger2example1

import android.util.Log
import javax.inject.Inject

class Car {
    companion object{
       private val TAG:String = "CAR"
    }
    private var Engine:Engine?=null
    private var Wheels:Wheels?=null

    @Inject
    constructor( Engine:Engine?,Wheels: Wheels?) {
        this.Engine=Engine
        this.Wheels = Wheels
    }

    @Inject
    fun enableRemote(Remote:Remote){
        Remote.setListener(this)
    }

    fun drive(){
        Engine?.start()
        Log.d(TAG, "driving....")
    }
}