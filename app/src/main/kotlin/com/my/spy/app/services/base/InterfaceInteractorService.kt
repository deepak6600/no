package com.my.spy.app.services.base

import android.content.Context
import com.my.spy.app.data.rxFirebase.InterfaceFirebase
import com.google.firebase.auth.FirebaseUser

interface InterfaceInteractorService<S : InterfaceService> {

    fun onAttach(service: S)

    fun onDetach()

    fun getService(): S?

    fun isNullService() : Boolean

    fun getContext(): Context

    fun firebase(): InterfaceFirebase

    fun user(): FirebaseUser?

}