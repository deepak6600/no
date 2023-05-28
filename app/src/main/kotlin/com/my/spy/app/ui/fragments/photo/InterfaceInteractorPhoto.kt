package com.my.spy.app.ui.fragments.photo

import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorPhoto<V : InterfaceViewPhoto> : InterfaceInteractor<V> {
    fun getPhotoCamera(facing:Int)
    fun valueEventEnablePhoto()
    fun valueEventEnablePermission()
}