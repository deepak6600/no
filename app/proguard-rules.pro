# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-dontwarn com.daimajia.easing.Glider
-dontwarn com.daimajia.easing.Skill

-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod
-keepattributes SourceFile
-keepattributes LineNumberTable
-keepattributes LocalVariableTable
-keepattributes Exceptions
-keepattributes RuntimeVisibleAnnotations
-keepattributes RuntimeVisibleParameterAnnotations
-keepattributes AnnotationDefault
-keepattributes SourceFile
-keepattributes LineNumberTable
-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod
-keepattributes Exceptions
-keepattributes RuntimeVisibleAnnotations
-keepattributes RuntimeVisibleParameterAnnotations
-keepattributes AnnotationDefault
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**
-keep class com.google.firebase.** { *; }
-dontwarn com.google.firebase.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-dontwarn com.google.android.gms.common.**
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.google.android.gms.internal.**
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-dontwarn com.google.android.gms.common.**
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.google.android.gms.internal.**
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-dontwarn com.google.android.gms.common.**
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.google.android.gms.internal.**
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-dontwarn com.google.android.gms.common.**
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.google.android.gms.internal.**
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-dontwarn com.google.android.gms.common.**
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.google.android.gms.internal.**
-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.google.android.gms.ads.identifier.**
-keep class com.google.android.gms.common.** { *; }
-keep class com.my.spy.app.MyClass
-keep class com.my.spy.app.MyClassToo
-keep class com.my.spy.app.** { *; }
#-renamesourcefileattribute SourceFile

-keepattributes Signature
-keepattributes *Annotation*
-keepclassmembers class com.my.spy.app.models.** {
  *;
}



