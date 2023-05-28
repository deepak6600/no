package com.my.spy.app.services.notificationService;

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
public final class InteractorNotificationService_Factory implements Factory<InteractorNotificationService> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorNotificationService_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorNotificationService get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorNotificationService_Factory create(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorNotificationService_Factory(contextProvider, firebaseProvider);
  }

  public static InteractorNotificationService newInstance(Context context,
      InterfaceFirebase firebase) {
    return new InteractorNotificationService(context, firebase);
  }
}
