package com.afterclass.dagger2example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    
  @Inject lateinit var Car:Car //It cannot be made private
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var component = DaggerCarComponent.create()
        component.inject(this)
      //  Car=component.getCar()
        Car.drive()

    }
}