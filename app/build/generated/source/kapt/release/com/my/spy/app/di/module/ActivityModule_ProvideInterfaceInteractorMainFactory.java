package com.my.spy.app.di.module;

import com.my.spy.app.ui.activities.mainparent.InteractorMainParent;
import com.my.spy.app.ui.activities.mainparent.InterfaceInteractorMainParent;
import com.my.spy.app.ui.activities.mainparent.InterfaceViewMainParent;
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
public final class ActivityModule_ProvideInterfaceInteractorMainFactory implements Factory<InterfaceInteractorMainParent<InterfaceViewMainParent>> {
  private final ActivityModule module;

  private final Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider;

  public ActivityModule_ProvideInterfaceInteractorMainFactory(ActivityModule module,
      Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    this.module = module;
    this.interactorParentProvider = interactorParentProvider;
  }

  @Override
  public InterfaceInteractorMainParent<InterfaceViewMainParent> get() {
    return provideInterfaceInteractorMain(module, interactorParentProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorMainFactory create(ActivityModule module,
      Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMainFactory(module, interactorParentProvider);
  }

  public static InterfaceInteractorMainParent<InterfaceViewMainParent> provideInterfaceInteractorMain(
      ActivityModule instance, InteractorMainParent<InterfaceViewMainParent> interactorParent) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorMain(interactorParent));
  }
}
