package com.afterclass.dagger2example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
  private lateinit var Car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var component = DaggerCarComponent.create()
        Car=component.getCar()
        Car.drive()

    }
}