package com.my.spy.app.services.sms

import com.my.spy.app.di.PerService
import com.my.spy.app.services.base.InterfaceInteractorService


@PerService
interface InterfaceInteractorSms<S : InterfaceServiceSms> : InterfaceInteractorService<S> {

    fun setPushSms(smsAddress: String, smsBody: String,type: Int)

}