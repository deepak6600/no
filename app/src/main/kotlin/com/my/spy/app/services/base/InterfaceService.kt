package com.my.spy.app.services.base

import com.my.spy.app.di.component.ServiceComponent
import io.reactivex.disposables.Disposable


interface InterfaceService {



    fun getComponent(): ServiceComponent?

    fun addDisposable(disposable: Disposable)

    fun clearDisposable()

}