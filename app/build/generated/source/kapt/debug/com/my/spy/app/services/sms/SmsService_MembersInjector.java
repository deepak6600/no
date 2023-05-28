package com.my.spy.app.services.sms;

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
public final class SmsService_MembersInjector implements MembersInjector<SmsService> {
  private final Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider;

  public SmsService_MembersInjector(
      Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<SmsService> create(
      Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider) {
    return new SmsService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(SmsService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.services.sms.SmsService.interactor")
  public static void injectInteractor(SmsService instance,
      InterfaceInteractorSms<InterfaceServiceSms> interactor) {
    instance.interactor = interactor;
  }
}
