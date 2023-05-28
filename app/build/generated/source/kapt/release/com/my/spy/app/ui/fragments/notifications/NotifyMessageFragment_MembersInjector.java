package com.my.spy.app.ui.fragments.notifications;

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
public final class NotifyMessageFragment_MembersInjector implements MembersInjector<NotifyMessageFragment> {
  private final Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public NotifyMessageFragment_MembersInjector(
      Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<NotifyMessageFragment> create(
      Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new NotifyMessageFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(NotifyMessageFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment.interactor")
  public static void injectInteractor(NotifyMessageFragment instance,
      InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> interactor) {
    instance.interactor = interactor;
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment.layoutM")
  public static void injectLayoutM(NotifyMessageFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
