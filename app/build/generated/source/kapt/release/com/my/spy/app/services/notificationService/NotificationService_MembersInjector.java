package com.my.spy.app.services.notificationService;

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
public final class NotificationService_MembersInjector implements MembersInjector<NotificationService> {
  private final Provider<InteractorNotificationService> interactorProvider;

  public NotificationService_MembersInjector(
      Provider<InteractorNotificationService> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<NotificationService> create(
      Provider<InteractorNotificationService> interactorProvider) {
    return new NotificationService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(NotificationService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.services.notificationService.NotificationService.interactor")
  public static void injectInteractor(NotificationService instance,
      InteractorNotificationService interactor) {
    instance.interactor = interactor;
  }
}
