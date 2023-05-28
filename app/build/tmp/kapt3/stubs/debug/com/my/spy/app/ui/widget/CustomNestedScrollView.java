package com.my.spy.app.ui.widget;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0015J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u001c\u001a\u00020\tH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/my/spy/app/ui/widget/CustomNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "e", "Landroid/view/MotionEvent;", "getE", "()Landroid/view/MotionEvent;", "fitSystemWindows", "", "insets", "Landroid/graphics/Rect;", "init", "", "isScrollable", "onAttachedToWindow", "onInterceptTouchEvent", "ev", "setAppBar", "topView", "app_debug"})
public abstract class CustomNestedScrollView extends androidx.core.widget.NestedScrollView {
    @org.jetbrains.annotations.Nullable
    private com.google.android.material.appbar.AppBarLayout appBar;
    
    @org.jetbrains.annotations.NotNull
    public abstract android.view.MotionEvent getE();
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomNestedScrollView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void init() {
    }
    
    @java.lang.Override
    public void onAttachedToWindow() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    protected boolean fitSystemWindows(@org.jetbrains.annotations.NotNull
    android.graphics.Rect insets) {
        return false;
    }
    
    private final int topView() {
        return 0;
    }
    
    @java.lang.Override
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent ev) {
        return false;
    }
    
    public final void setAppBar(@org.jetbrains.annotations.NotNull
    com.google.android.material.appbar.AppBarLayout appBar) {
    }
    
    private final void isScrollable() {
    }
}