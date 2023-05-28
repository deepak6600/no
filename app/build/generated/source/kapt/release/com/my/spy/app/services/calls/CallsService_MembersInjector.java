package com.my.spy.app.services.calls;

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
public final class CallsService_MembersInjector implements MembersInjector<CallsService> {
  private final Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider;

  public CallsService_MembersInjector(
      Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<CallsService> create(
      Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    return new CallsService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(CallsService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.services.calls.CallsService.interactor")
  public static void injectInteractor(CallsService instance,
      InterfaceInteractorCalls<InterfaceServiceCalls> interactor) {
    instance.interactor = interactor;
  }
}
