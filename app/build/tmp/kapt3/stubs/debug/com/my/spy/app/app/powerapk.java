package com.my.spy.app.app;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/my/spy/app/app/powerapk;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class powerapk extends android.app.Application {
    public static com.my.spy.app.di.component.AppComponent appComponent;
    public static com.chrisplus.rootmanager.RootManager root;
    @org.jetbrains.annotations.NotNull
    public static final com.my.spy.app.app.powerapk.Companion Companion = null;
    
    public powerapk() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.my.spy.app.di.component.AppComponent getAppComponent() {
        return null;
    }
    
    public static final void setAppComponent(@org.jetbrains.annotations.NotNull
    com.my.spy.app.di.component.AppComponent p0) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/my/spy/app/app/powerapk$Companion;", "", "()V", "appComponent", "Lcom/my/spy/app/di/component/AppComponent;", "getAppComponent$annotations", "getAppComponent", "()Lcom/my/spy/app/di/component/AppComponent;", "setAppComponent", "(Lcom/my/spy/app/di/component/AppComponent;)V", "root", "Lcom/chrisplus/rootmanager/RootManager;", "getRoot", "()Lcom/chrisplus/rootmanager/RootManager;", "setRoot", "(Lcom/chrisplus/rootmanager/RootManager;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.my.spy.app.di.component.AppComponent getAppComponent() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getAppComponent$annotations() {
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull
        com.my.spy.app.di.component.AppComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.chrisplus.rootmanager.RootManager getRoot() {
            return null;
        }
        
        public final void setRoot(@org.jetbrains.annotations.NotNull
        com.chrisplus.rootmanager.RootManager p0) {
        }
    }
}