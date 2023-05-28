package com.my.spy.app.ui.fragments.calls;

@com.my.spy.app.di.PerActivity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/my/spy/app/ui/fragments/calls/InterfaceInteractorCalls;", "V", "Lcom/my/spy/app/ui/fragments/calls/InterfaceViewCalls;", "Lcom/my/spy/app/ui/activities/base/InterfaceInteractor;", "stopAudioCallHolder", "", "app_debug"})
public abstract interface InterfaceInteractorCalls<V extends com.my.spy.app.ui.fragments.calls.InterfaceViewCalls> extends com.my.spy.app.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void stopAudioCallHolder();
}