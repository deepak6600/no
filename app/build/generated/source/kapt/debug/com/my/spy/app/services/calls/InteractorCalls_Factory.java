package com.my.spy.app.services.calls;

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
public final class InteractorCalls_Factory<S extends InterfaceServiceCalls> implements Factory<InteractorCalls<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorCalls_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorCalls<S> get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceServiceCalls> InteractorCalls_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorCalls_Factory<S>(contextProvider, firebaseProvider);
  }

  public static <S extends InterfaceServiceCalls> InteractorCalls<S> newInstance(Context context,
      InterfaceFirebase firebase) {
    return new InteractorCalls<S>(context, firebase);
  }
}
