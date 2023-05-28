package com.my.spy.app.ui.fragments.maps;

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
public final class InteractorMaps_Factory<V extends InterfaceViewMaps> implements Factory<InteractorMaps<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorMaps_Factory(Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorMaps<V> get() {
    return newInstance(supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewMaps> InteractorMaps_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider, Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorMaps_Factory<V>(supportFragmentProvider, contextProvider, firebaseProvider);
  }

  public static <V extends InterfaceViewMaps> InteractorMaps<V> newInstance(
      FragmentManager supportFragment, Context context, InterfaceFirebase firebase) {
    return new InteractorMaps<V>(supportFragment, context, firebase);
  }
}
