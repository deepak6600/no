package com.my.spy.app.utils.checkForegroundApp;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/my/spy/app/utils/checkForegroundApp/CheckForegroundApp;", "Lcom/my/spy/app/utils/checkForegroundApp/CheckDetector;", "()V", "getForegroundPostLollipop", "", "context", "Landroid/content/Context;", "getForegroundPreLollipop", "app_debug"})
@kotlin.Suppress(names = {"DEPRECATION", "NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
public final class CheckForegroundApp implements com.my.spy.app.utils.checkForegroundApp.CheckDetector {
    
    public CheckForegroundApp() {
        super();
    }
    
    @java.lang.Override
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP_MR1)
    @org.jetbrains.annotations.Nullable
    public java.lang.String getForegroundPostLollipop(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getForegroundPreLollipop(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}