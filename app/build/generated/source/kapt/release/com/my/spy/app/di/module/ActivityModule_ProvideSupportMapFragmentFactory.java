package com.my.spy.app.di.module;

import com.google.android.gms.maps.SupportMapFragment;
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
public final class ActivityModule_ProvideSupportMapFragmentFactory implements Factory<SupportMapFragment> {
  private final ActivityModule module;

  public ActivityModule_ProvideSupportMapFragmentFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public SupportMapFragment get() {
    return provideSupportMapFragment(module);
  }

  public static ActivityModule_ProvideSupportMapFragmentFactory create(ActivityModule module) {
    return new ActivityModule_ProvideSupportMapFragmentFactory(module);
  }

  public static SupportMapFragment provideSupportMapFragment(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSupportMapFragment());
  }
}
