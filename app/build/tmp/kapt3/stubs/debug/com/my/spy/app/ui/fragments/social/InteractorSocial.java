package com.my.spy.app.ui.fragments.social;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/my/spy/app/ui/fragments/social/InteractorSocial;", "V", "Lcom/my/spy/app/ui/fragments/social/InterfaceViewSocial;", "Lcom/my/spy/app/ui/activities/base/BaseInteractor;", "Lcom/my/spy/app/ui/fragments/social/InterfaceInteractorSocial;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/my/spy/app/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/my/spy/app/data/rxFirebase/InterfaceFirebase;)V", "valueEventEnablePermission", "", "valueEventSocial", "app_debug"})
public final class InteractorSocial<V extends com.my.spy.app.ui.fragments.social.InterfaceViewSocial> extends com.my.spy.app.ui.activities.base.BaseInteractor<V> implements com.my.spy.app.ui.fragments.social.InterfaceInteractorSocial<V> {
    
    @javax.inject.Inject
    public InteractorSocial(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.my.spy.app.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
    
    @java.lang.Override
    public void valueEventSocial() {
    }
    
    @java.lang.Override
    public void valueEventEnablePermission() {
    }
}