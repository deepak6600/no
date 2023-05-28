package com.my.spy.app.utils.async;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B>\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0015\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0015J\b\u0010\u0012\u001a\u00020\u0006H\u0015R+\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/my/spy/app/utils/async/AsyncTaskRunCommand;", "Landroid/os/AsyncTask;", "", "", "onPreFunc", "Lkotlin/Function0;", "", "onPostFunc", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "onPreExecute", "app_debug"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class AsyncTaskRunCommand extends android.os.AsyncTask<java.lang.String, java.lang.Boolean, java.lang.Boolean> {
    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPreFunc = null;
    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onPostFunc = null;
    
    public AsyncTaskRunCommand(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onPreFunc, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onPostFunc) {
        super();
    }
    
    @java.lang.Override
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    protected void onPreExecute() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull
    java.lang.String... params) {
        return null;
    }
    
    @java.lang.Override
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    protected void onPostExecute(boolean result) {
    }
    
    public AsyncTaskRunCommand() {
        super();
    }
}