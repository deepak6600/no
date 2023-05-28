package com.my.spy.app.ui.activities.register

import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorRegister<V : InterfaceViewRegister> : InterfaceInteractor<V> {

    fun signUpDisposable(email: String, pass: String)

}