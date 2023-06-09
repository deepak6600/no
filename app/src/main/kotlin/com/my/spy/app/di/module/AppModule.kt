@file:Suppress("unused")

package com.my.spy.app.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app : Application){

    @Provides
    fun provideContext(): Context = app.applicationContext

}