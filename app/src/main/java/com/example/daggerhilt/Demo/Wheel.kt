package com.example.daggerhilt.Demo

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()
    fun getwheel(){
        Log.i("main", "wheel is running.. ")
    }
}