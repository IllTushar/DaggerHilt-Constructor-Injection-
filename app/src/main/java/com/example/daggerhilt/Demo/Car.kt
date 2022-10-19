package com.example.daggerhilt.Demo

import android.util.Log
import android.widget.Toast
import javax.inject.Inject
//Constructor injection
class Car @Inject constructor(private val engine: Engine,private val wheel: Wheel)
{
    fun carRun(){
        engine.getEngine()
        wheel.getwheel()
        Log.i("main","Car is Running")
    }
}