package com.my.spy.app.ui.fragments.notifications

import com.my.spy.app.ui.activities.base.InterfaceInteractor


interface InterfaceInteractorNotifyMessage<V : InterfaceViewNotifyMessage> : InterfaceInteractor<V> {
    fun valueEventEnableNotifications()
}