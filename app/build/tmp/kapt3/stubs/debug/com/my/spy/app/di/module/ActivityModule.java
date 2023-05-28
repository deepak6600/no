package com.my.spy.app.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H\u0007J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0014H\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0007J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001dH\u0007J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020 0!H\u0007J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020$0%H\u0007J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020(0)H\u0007J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020,0-H\u0007J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020001H\u0007J\u001c\u00102\u001a\b\u0012\u0004\u0012\u000204032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020405H\u0007J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u0007J\b\u00109\u001a\u00020:H\u0007J\b\u0010;\u001a\u00020<H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/my/spy/app/di/module/ActivityModule;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "provideActivity", "provideContext", "Landroid/content/Context;", "provideInterfaceInteractorCalls", "Lcom/my/spy/app/ui/fragments/calls/InterfaceInteractorCalls;", "Lcom/my/spy/app/ui/fragments/calls/InterfaceViewCalls;", "interactor", "Lcom/my/spy/app/ui/fragments/calls/InteractorCalls;", "provideInterfaceInteractorKeys", "Lcom/my/spy/app/ui/fragments/keylog/InterfaceInteractorKeys;", "Lcom/my/spy/app/ui/fragments/keylog/InterfaceViewKeys;", "Lcom/my/spy/app/ui/fragments/keylog/InteractorKeys;", "provideInterfaceInteractorLogin", "Lcom/my/spy/app/ui/activities/login/InterfaceInteractorLogin;", "Lcom/my/spy/app/ui/activities/login/InterfaceViewLogin;", "Lcom/my/spy/app/ui/activities/login/InteractorLogin;", "provideInterfaceInteractorMain", "Lcom/my/spy/app/ui/activities/mainparent/InterfaceInteractorMainParent;", "Lcom/my/spy/app/ui/activities/mainparent/InterfaceViewMainParent;", "interactorParent", "Lcom/my/spy/app/ui/activities/mainparent/InteractorMainParent;", "provideInterfaceInteractorMaps", "Lcom/my/spy/app/ui/fragments/maps/InterfaceInteractorMaps;", "Lcom/my/spy/app/ui/fragments/maps/InterfaceViewMaps;", "Lcom/my/spy/app/ui/fragments/maps/InteractorMaps;", "provideInterfaceInteractorMessage", "Lcom/my/spy/app/ui/fragments/message/InterfaceInteractorMessage;", "Lcom/my/spy/app/ui/fragments/message/InterfaceViewMessage;", "Lcom/my/spy/app/ui/fragments/message/InteractorMessage;", "provideInterfaceInteractorNotify", "Lcom/my/spy/app/ui/fragments/notifications/InterfaceInteractorNotifyMessage;", "Lcom/my/spy/app/ui/fragments/notifications/InterfaceViewNotifyMessage;", "Lcom/my/spy/app/ui/fragments/notifications/InteractorNotifyMessage;", "provideInterfaceInteractorPhoto", "Lcom/my/spy/app/ui/fragments/photo/InterfaceInteractorPhoto;", "Lcom/my/spy/app/ui/fragments/photo/InterfaceViewPhoto;", "Lcom/my/spy/app/ui/fragments/photo/InteractorPhoto;", "provideInterfaceInteractorRecording", "Lcom/my/spy/app/ui/fragments/recording/InterfaceInteractorRecording;", "Lcom/my/spy/app/ui/fragments/recording/InterfaceViewRecording;", "Lcom/my/spy/app/ui/fragments/recording/InteractorRecording;", "provideInterfaceInteractorRegister", "Lcom/my/spy/app/ui/activities/register/InterfaceInteractorRegister;", "Lcom/my/spy/app/ui/activities/register/InterfaceViewRegister;", "Lcom/my/spy/app/ui/activities/register/InteractorRegister;", "provideInterfaceInteractorSocial", "Lcom/my/spy/app/ui/fragments/social/InterfaceInteractorSocial;", "Lcom/my/spy/app/ui/fragments/social/InterfaceViewSocial;", "Lcom/my/spy/app/ui/fragments/social/InteractorSocial;", "provideLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "provideSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "provideSupportMapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "app_debug"})
public final class ActivityModule {
    @org.jetbrains.annotations.NotNull
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public ActivityModule(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final android.content.Context provideContext() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.app.AppCompatActivity provideActivity() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentManager provideSupportFragmentManager() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.maps.SupportMapFragment provideSupportMapFragment() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLayoutManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.activities.mainparent.InterfaceInteractorMainParent<com.my.spy.app.ui.activities.mainparent.InterfaceViewMainParent> provideInterfaceInteractorMain(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.mainparent.InteractorMainParent<com.my.spy.app.ui.activities.mainparent.InterfaceViewMainParent> interactorParent) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.activities.login.InterfaceInteractorLogin<com.my.spy.app.ui.activities.login.InterfaceViewLogin> provideInterfaceInteractorLogin(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.login.InteractorLogin<com.my.spy.app.ui.activities.login.InterfaceViewLogin> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.activities.register.InterfaceInteractorRegister<com.my.spy.app.ui.activities.register.InterfaceViewRegister> provideInterfaceInteractorRegister(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.activities.register.InteractorRegister<com.my.spy.app.ui.activities.register.InterfaceViewRegister> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.maps.InterfaceInteractorMaps<com.my.spy.app.ui.fragments.maps.InterfaceViewMaps> provideInterfaceInteractorMaps(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.maps.InteractorMaps<com.my.spy.app.ui.fragments.maps.InterfaceViewMaps> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.calls.InterfaceInteractorCalls<com.my.spy.app.ui.fragments.calls.InterfaceViewCalls> provideInterfaceInteractorCalls(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.calls.InteractorCalls<com.my.spy.app.ui.fragments.calls.InterfaceViewCalls> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.keylog.InterfaceInteractorKeys<com.my.spy.app.ui.fragments.keylog.InterfaceViewKeys> provideInterfaceInteractorKeys(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.keylog.InteractorKeys<com.my.spy.app.ui.fragments.keylog.InterfaceViewKeys> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.message.InterfaceInteractorMessage<com.my.spy.app.ui.fragments.message.InterfaceViewMessage> provideInterfaceInteractorMessage(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.message.InteractorMessage<com.my.spy.app.ui.fragments.message.InterfaceViewMessage> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.photo.InterfaceInteractorPhoto<com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto> provideInterfaceInteractorPhoto(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.photo.InteractorPhoto<com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.social.InterfaceInteractorSocial<com.my.spy.app.ui.fragments.social.InterfaceViewSocial> provideInterfaceInteractorSocial(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.social.InteractorSocial<com.my.spy.app.ui.fragments.social.InterfaceViewSocial> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.recording.InterfaceInteractorRecording<com.my.spy.app.ui.fragments.recording.InterfaceViewRecording> provideInterfaceInteractorRecording(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.recording.InteractorRecording<com.my.spy.app.ui.fragments.recording.InterfaceViewRecording> interactor) {
        return null;
    }
    
    @dagger.Provides
    @com.my.spy.app.di.PerActivity
    @org.jetbrains.annotations.NotNull
    public final com.my.spy.app.ui.fragments.notifications.InterfaceInteractorNotifyMessage<com.my.spy.app.ui.fragments.notifications.InterfaceViewNotifyMessage> provideInterfaceInteractorNotify(@org.jetbrains.annotations.NotNull
    com.my.spy.app.ui.fragments.notifications.InteractorNotifyMessage<com.my.spy.app.ui.fragments.notifications.InterfaceViewNotifyMessage> interactor) {
        return null;
    }
}