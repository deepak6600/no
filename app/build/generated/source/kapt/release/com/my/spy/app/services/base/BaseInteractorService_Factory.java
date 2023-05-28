package com.my.spy.app.services.base;

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
public final class BaseInteractorService_Factory<S extends InterfaceService> implements Factory<BaseInteractorService<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public BaseInteractorService_Factory(Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public BaseInteractorService<S> get() {
    return newInstance(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceService> BaseInteractorService_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new BaseInteractorService_Factory<S>(contextProvider, firebaseProvider);
  }

  public static <S extends InterfaceService> BaseInteractorService<S> newInstance(Context context,
      InterfaceFirebase firebase) {
    return new BaseInteractorService<S>(context, firebase);
  }
}
