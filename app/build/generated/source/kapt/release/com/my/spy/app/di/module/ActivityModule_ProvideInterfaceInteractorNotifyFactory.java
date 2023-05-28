package com.my.spy.app.di.module;

import com.my.spy.app.ui.fragments.notifications.InteractorNotifyMessage;
import com.my.spy.app.ui.fragments.notifications.InterfaceInteractorNotifyMessage;
import com.my.spy.app.ui.fragments.notifications.InterfaceViewNotifyMessage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.my.spy.app.di.PerActivity")
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
public final class ActivityModule_ProvideInterfaceInteractorNotifyFactory implements Factory<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> {
  private final ActivityModule module;

  private final Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorNotifyFactory(ActivityModule module,
      Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> get() {
    return provideInterfaceInteractorNotify(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorNotifyFactory create(ActivityModule module,
      Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorNotifyFactory(module, interactorProvider);
  }

  public static InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> provideInterfaceInteractorNotify(
      ActivityModule instance, InteractorNotifyMessage<InterfaceViewNotifyMessage> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorNotify(interactor));
  }
}
