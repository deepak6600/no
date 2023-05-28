package com.my.spy.app.di.module;

import androidx.fragment.app.FragmentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class ActivityModule_ProvideSupportFragmentManagerFactory implements Factory<FragmentManager> {
  private final ActivityModule module;

  public ActivityModule_ProvideSupportFragmentManagerFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public FragmentManager get() {
    return provideSupportFragmentManager(module);
  }

  public static ActivityModule_ProvideSupportFragmentManagerFactory create(ActivityModule module) {
    return new ActivityModule_ProvideSupportFragmentManagerFactory(module);
  }

  public static FragmentManager provideSupportFragmentManager(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSupportFragmentManager());
  }
}
