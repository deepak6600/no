package com.my.spy.app.utils.hiddenCameraServiceUtils.config;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/my/spy/app/utils/hiddenCameraServiceUtils/config/CameraFacing;", "", "()V", "Companion", "SupportedCameraFacing", "app_debug"})
public final class CameraFacing {
    public static final int REAR_FACING_CAMERA = 0;
    public static final int FRONT_FACING_CAMERA = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.my.spy.app.utils.hiddenCameraServiceUtils.config.CameraFacing.Companion Companion = null;
    
    public CameraFacing() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/my/spy/app/utils/hiddenCameraServiceUtils/config/CameraFacing$Companion;", "", "()V", "FRONT_FACING_CAMERA", "", "REAR_FACING_CAMERA", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/my/spy/app/utils/hiddenCameraServiceUtils/config/CameraFacing$SupportedCameraFacing;", "", "app_debug"})
    @androidx.annotation.IntDef(value = {0, 1})
    public static abstract @interface SupportedCameraFacing {
    }
}