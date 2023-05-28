package com.my.spy.app.di.module;

import com.my.spy.app.ui.fragments.social.InteractorSocial;
import com.my.spy.app.ui.fragments.social.InterfaceInteractorSocial;
import com.my.spy.app.ui.fragments.social.InterfaceViewSocial;
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
public final class ActivityModule_ProvideInterfaceInteractorSocialFactory implements Factory<InterfaceInteractorSocial<InterfaceViewSocial>> {
  private final ActivityModule module;

  private final Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorSocialFactory(ActivityModule module,
      Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorSocial<InterfaceViewSocial> get() {
    return provideInterfaceInteractorSocial(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorSocialFactory create(ActivityModule module,
      Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorSocialFactory(module, interactorProvider);
  }

  public static InterfaceInteractorSocial<InterfaceViewSocial> provideInterfaceInteractorSocial(
      ActivityModule instance, InteractorSocial<InterfaceViewSocial> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorSocial(interactor));
  }
}
