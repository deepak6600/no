package com.my.spy.app.ui.fragments.social;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/my/spy/app/ui/fragments/social/InterfaceViewSocial;", "Lcom/my/spy/app/ui/activities/base/InterfaceView;", "setValuePermission", "", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "successResult", "app_debug"})
public abstract interface InterfaceViewSocial extends com.my.spy.app.ui.activities.base.InterfaceView {
    
    public abstract void setValuePermission(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void successResult(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DataSnapshot dataSnapshot);
}