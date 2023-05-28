package com.my.spy.app.ui.fragments.keylog;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class KeysFragment_MembersInjector implements MembersInjector<KeysFragment> {
  private final Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public KeysFragment_MembersInjector(
      Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<KeysFragment> create(
      Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new KeysFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(KeysFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.keylog.KeysFragment.interactor")
  public static void injectInteractor(KeysFragment instance,
      InterfaceInteractorKeys<InterfaceViewKeys> interactor) {
    instance.interactor = interactor;
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.keylog.KeysFragment.layoutM")
  public static void injectLayoutM(KeysFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
