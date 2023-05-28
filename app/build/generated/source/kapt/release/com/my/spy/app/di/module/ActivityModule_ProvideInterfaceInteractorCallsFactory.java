package com.my.spy.app.di.module;

import com.my.spy.app.ui.fragments.calls.InteractorCalls;
import com.my.spy.app.ui.fragments.calls.InterfaceInteractorCalls;
import com.my.spy.app.ui.fragments.calls.InterfaceViewCalls;
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
public final class ActivityModule_ProvideInterfaceInteractorCallsFactory implements Factory<InterfaceInteractorCalls<InterfaceViewCalls>> {
  private final ActivityModule module;

  private final Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorCallsFactory(ActivityModule module,
      Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorCalls<InterfaceViewCalls> get() {
    return provideInterfaceInteractorCalls(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorCallsFactory create(ActivityModule module,
      Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorCallsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorCalls<InterfaceViewCalls> provideInterfaceInteractorCalls(
      ActivityModule instance, InteractorCalls<InterfaceViewCalls> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorCalls(interactor));
  }
}
