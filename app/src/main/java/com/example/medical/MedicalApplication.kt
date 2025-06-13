package com.example.medical

import android.app.Application
import com.example.medical.data.AppContainer
import com.example.medical.data.AppDataContainer

class MedicalApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}