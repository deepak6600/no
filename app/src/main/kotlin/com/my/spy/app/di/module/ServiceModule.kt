@file:Suppress("unused")

package com.my.spy.app.di.module

import android.app.Service
import android.content.Context
import com.my.spy.app.di.PerService
import com.my.spy.app.services.calls.InteractorCalls
import com.my.spy.app.services.calls.InterfaceInteractorCalls
import com.my.spy.app.services.calls.InterfaceServiceCalls
import com.my.spy.app.services.sms.InteractorSms
import com.my.spy.app.services.sms.InterfaceInteractorSms
import com.my.spy.app.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}