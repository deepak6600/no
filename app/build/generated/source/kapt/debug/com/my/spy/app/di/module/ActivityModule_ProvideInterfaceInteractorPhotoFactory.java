package com.my.spy.app.di.module;

import com.my.spy.app.ui.fragments.photo.InteractorPhoto;
import com.my.spy.app.ui.fragments.photo.InterfaceInteractorPhoto;
import com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto;
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
public final class ActivityModule_ProvideInterfaceInteractorPhotoFactory implements Factory<InterfaceInteractorPhoto<InterfaceViewPhoto>> {
  private final ActivityModule module;

  private final Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorPhotoFactory(ActivityModule module,
      Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorPhoto<InterfaceViewPhoto> get() {
    return provideInterfaceInteractorPhoto(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorPhotoFactory create(ActivityModule module,
      Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorPhotoFactory(module, interactorProvider);
  }

  public static InterfaceInteractorPhoto<InterfaceViewPhoto> provideInterfaceInteractorPhoto(
      ActivityModule instance, InteractorPhoto<InterfaceViewPhoto> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorPhoto(interactor));
  }
}
