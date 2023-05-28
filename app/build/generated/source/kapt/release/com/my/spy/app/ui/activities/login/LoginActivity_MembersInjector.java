package com.my.spy.app.ui.activities.login;

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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider;

  public LoginActivity_MembersInjector(
      Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider) {
    return new LoginActivity_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.activities.login.LoginActivity.interactor")
  public static void injectInteractor(LoginActivity instance,
      InterfaceInteractorLogin<InterfaceViewLogin> interactor) {
    instance.interactor = interactor;
  }
}
