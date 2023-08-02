package com.example.mypokedexer

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyPokeDexApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}