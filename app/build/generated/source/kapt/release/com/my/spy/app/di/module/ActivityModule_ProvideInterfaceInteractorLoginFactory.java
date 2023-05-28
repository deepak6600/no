package com.my.spy.app.di.module;

import com.my.spy.app.ui.activities.login.InteractorLogin;
import com.my.spy.app.ui.activities.login.InterfaceInteractorLogin;
import com.my.spy.app.ui.activities.login.InterfaceViewLogin;
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
public final class ActivityModule_ProvideInterfaceInteractorLoginFactory implements Factory<InterfaceInteractorLogin<InterfaceViewLogin>> {
  private final ActivityModule module;

  private final Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorLoginFactory(ActivityModule module,
      Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorLogin<InterfaceViewLogin> get() {
    return provideInterfaceInteractorLogin(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorLoginFactory create(ActivityModule module,
      Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorLoginFactory(module, interactorProvider);
  }

  public static InterfaceInteractorLogin<InterfaceViewLogin> provideInterfaceInteractorLogin(
      ActivityModule instance, InteractorLogin<InterfaceViewLogin> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorLogin(interactor));
  }
}
