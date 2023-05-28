package com.my.spy.app.di.component

import com.my.spy.app.di.PerService
import com.my.spy.app.di.module.ServiceModule
import com.my.spy.app.services.calls.CallsService
import com.my.spy.app.services.sms.SmsService
import com.my.spy.app.services.social.MonitorService
import dagger.Component


@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}