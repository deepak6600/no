package com.my.spy.app.ui.fragments.calls;

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
public final class CallsFragment_MembersInjector implements MembersInjector<CallsFragment> {
  private final Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public CallsFragment_MembersInjector(
      Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<CallsFragment> create(
      Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new CallsFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(CallsFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.calls.CallsFragment.interactor")
  public static void injectInteractor(CallsFragment instance,
      InterfaceInteractorCalls<InterfaceViewCalls> interactor) {
    instance.interactor = interactor;
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.calls.CallsFragment.layoutM")
  public static void injectLayoutM(CallsFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
