package com.afterclass.dagger2example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afterclass.dagger2example1.car.Car
import com.afterclass.dagger2example1.car.DaggerCarComponent
import com.afterclass.dagger2example1.dagger.DiselEngineModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

  @Inject lateinit var Car: Car //It cannot be made private

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var component = DaggerCarComponent.builder().diselEngineModule(DiselEngineModule(100)).build()
        component.inject(this)
      //  Car=component.getCar()
        Car.drive()

    }
}