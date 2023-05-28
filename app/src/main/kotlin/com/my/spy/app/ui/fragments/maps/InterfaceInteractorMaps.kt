package com.my.spy.app.ui.fragments.maps

import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorMaps<V : InterfaceViewMaps> : InterfaceInteractor<V> {
    fun valueEventLocation()
    fun valueEventEnableGps()
    fun valueEventEnablePermission()
}