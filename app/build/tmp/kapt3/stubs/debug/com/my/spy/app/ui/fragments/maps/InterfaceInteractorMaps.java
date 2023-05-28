package com.my.spy.app.ui.fragments.maps;

@com.my.spy.app.di.PerActivity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/my/spy/app/ui/fragments/maps/InterfaceInteractorMaps;", "V", "Lcom/my/spy/app/ui/fragments/maps/InterfaceViewMaps;", "Lcom/my/spy/app/ui/activities/base/InterfaceInteractor;", "valueEventEnableGps", "", "valueEventEnablePermission", "valueEventLocation", "app_debug"})
public abstract interface InterfaceInteractorMaps<V extends com.my.spy.app.ui.fragments.maps.InterfaceViewMaps> extends com.my.spy.app.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void valueEventLocation();
    
    public abstract void valueEventEnableGps();
    
    public abstract void valueEventEnablePermission();
}