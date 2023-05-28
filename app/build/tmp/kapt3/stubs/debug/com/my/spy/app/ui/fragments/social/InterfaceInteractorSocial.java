package com.my.spy.app.ui.fragments.social;

@com.my.spy.app.di.PerActivity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/my/spy/app/ui/fragments/social/InterfaceInteractorSocial;", "V", "Lcom/my/spy/app/ui/fragments/social/InterfaceViewSocial;", "Lcom/my/spy/app/ui/activities/base/InterfaceInteractor;", "valueEventEnablePermission", "", "valueEventSocial", "app_debug"})
public abstract interface InterfaceInteractorSocial<V extends com.my.spy.app.ui.fragments.social.InterfaceViewSocial> extends com.my.spy.app.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void valueEventSocial();
    
    public abstract void valueEventEnablePermission();
}