@file:Suppress("unused")

package com.my.spy.app.di.component

import com.my.spy.app.app.powerapk
import com.my.spy.app.data.rxFirebase.InterfaceFirebase
import com.my.spy.app.di.module.AppModule
import com.my.spy.app.di.module.FirebaseModule
import com.my.spy.app.services.accessibilityData.AccessibilityDataService
import com.my.spy.app.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: powerapk)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}