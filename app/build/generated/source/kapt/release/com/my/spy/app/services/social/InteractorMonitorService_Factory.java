package com.my.spy.app.services.social;

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
public final class InteractorMonitorService_Factory implements Factory<InteractorMonitorService> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorMonitorService_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorMonitorService get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorMonitorService_Factory create(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorMonitorService_Factory(contextProvider, firebaseProvider);
  }

  public static InteractorMonitorService newInstance(Context context, InterfaceFirebase firebase) {
    return new InteractorMonitorService(context, firebase);
  }
}
