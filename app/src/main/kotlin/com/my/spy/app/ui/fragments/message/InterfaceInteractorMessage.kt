package com.my.spy.app.ui.fragments.message

import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorMessage<V : InterfaceViewMessage> : InterfaceInteractor<V>