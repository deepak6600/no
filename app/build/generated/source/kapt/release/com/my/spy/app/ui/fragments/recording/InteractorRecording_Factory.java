package com.my.spy.app.ui.fragments.recording;

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
public final class InteractorRecording_Factory<V extends InterfaceViewRecording> implements Factory<InteractorRecording<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorRecording_Factory(Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorRecording<V> get() {
    return newInstance(supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewRecording> InteractorRecording_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider, Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorRecording_Factory<V>(supportFragmentProvider, contextProvider, firebaseProvider);
  }

  public static <V extends InterfaceViewRecording> InteractorRecording<V> newInstance(
      FragmentManager supportFragment, Context context, InterfaceFirebase firebase) {
    return new InteractorRecording<V>(supportFragment, context, firebase);
  }
}
