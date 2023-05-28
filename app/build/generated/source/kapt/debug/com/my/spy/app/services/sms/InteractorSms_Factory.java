package com.my.spy.app.services.sms;

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
public final class InteractorSms_Factory<S extends InterfaceServiceSms> implements Factory<InteractorSms<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorSms_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorSms<S> get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceServiceSms> InteractorSms_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorSms_Factory<S>(contextProvider, firebaseProvider);
  }

  public static <S extends InterfaceServiceSms> InteractorSms<S> newInstance(Context context,
      InterfaceFirebase firebase) {
    return new InteractorSms<S>(context, firebase);
  }
}
