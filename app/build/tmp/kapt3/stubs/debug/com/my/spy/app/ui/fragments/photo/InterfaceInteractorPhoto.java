package com.my.spy.app.ui.fragments.photo;

@com.my.spy.app.di.PerActivity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/my/spy/app/ui/fragments/photo/InterfaceInteractorPhoto;", "V", "Lcom/my/spy/app/ui/fragments/photo/InterfaceViewPhoto;", "Lcom/my/spy/app/ui/activities/base/InterfaceInteractor;", "getPhotoCamera", "", "facing", "", "valueEventEnablePermission", "valueEventEnablePhoto", "app_debug"})
public abstract interface InterfaceInteractorPhoto<V extends com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto> extends com.my.spy.app.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void getPhotoCamera(int facing);
    
    public abstract void valueEventEnablePhoto();
    
    public abstract void valueEventEnablePermission();
}