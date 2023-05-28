package com.my.spy.app.services.accessibilityData;

import android.content.Context;
import com.my.spy.app.data.rxFirebase.InterfaceFirebase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class InteractorAccessibilityData_Factory implements Factory<InteractorAccessibilityData> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorAccessibilityData_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorAccessibilityData get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorAccessibilityData_Factory create(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorAccessibilityData_Factory(contextProvider, firebaseProvider);
  }

  public static InteractorAccessibilityData newInstance(Context context,
      InterfaceFirebase firebase) {
    return new InteractorAccessibilityData(context, firebase);
  }
}
