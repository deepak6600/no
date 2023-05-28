package com.my.spy.app.di.module;

import com.my.spy.app.ui.fragments.message.InteractorMessage;
import com.my.spy.app.ui.fragments.message.InterfaceInteractorMessage;
import com.my.spy.app.ui.fragments.message.InterfaceViewMessage;
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
public final class ActivityModule_ProvideInterfaceInteractorMessageFactory implements Factory<InterfaceInteractorMessage<InterfaceViewMessage>> {
  private final ActivityModule module;

  private final Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorMessageFactory(ActivityModule module,
      Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorMessage<InterfaceViewMessage> get() {
    return provideInterfaceInteractorMessage(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorMessageFactory create(
      ActivityModule module, Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMessageFactory(module, interactorProvider);
  }

  public static InterfaceInteractorMessage<InterfaceViewMessage> provideInterfaceInteractorMessage(
      ActivityModule instance, InteractorMessage<InterfaceViewMessage> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorMessage(interactor));
  }
}
