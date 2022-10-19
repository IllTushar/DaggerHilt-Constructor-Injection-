package com.example.daggerhilt.Demo

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()
    fun getEngine(){
        Log.i("main","Engine is running..")
    }
}