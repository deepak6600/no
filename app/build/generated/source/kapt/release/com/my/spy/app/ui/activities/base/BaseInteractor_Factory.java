package com.my.spy.app.ui.activities.base;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
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
public final class BaseInteractor_Factory<V extends InterfaceView> implements Factory<BaseInteractor<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public BaseInteractor_Factory(Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public BaseInteractor<V> get() {
    return newInstance(supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceView> BaseInteractor_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider, Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new BaseInteractor_Factory<V>(supportFragmentProvider, contextProvider, firebaseProvider);
  }

  public static <V extends InterfaceView> BaseInteractor<V> newInstance(
      FragmentManager supportFragment, Context context, InterfaceFirebase firebase) {
    return new BaseInteractor<V>(supportFragment, context, firebase);
  }
}
