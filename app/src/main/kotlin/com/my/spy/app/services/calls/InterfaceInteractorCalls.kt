package com.my.spy.app.services.calls

import com.my.spy.app.di.PerService
import com.my.spy.app.services.base.InterfaceInteractorService


@PerService
interface InterfaceInteractorCalls<S : InterfaceServiceCalls> : InterfaceInteractorService<S> {

    fun startRecording(phoneNumber:String?,type:Int)
    fun stopRecording()

}