package com.my.spy.app.ui.activities.register;

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
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider;

  public RegisterActivity_MembersInjector(
      Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider) {
    return new RegisterActivity_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.activities.register.RegisterActivity.interactor")
  public static void injectInteractor(RegisterActivity instance,
      InterfaceInteractorRegister<InterfaceViewRegister> interactor) {
    instance.interactor = interactor;
  }
}
