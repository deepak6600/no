package com.my.spy.app.di.module;

import androidx.appcompat.app.AppCompatActivity;
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
public final class ActivityModule_ProvideActivityFactory implements Factory<AppCompatActivity> {
  private final ActivityModule module;

  public ActivityModule_ProvideActivityFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public AppCompatActivity get() {
    return provideActivity(module);
  }

  public static ActivityModule_ProvideActivityFactory create(ActivityModule module) {
    return new ActivityModule_ProvideActivityFactory(module);
  }

  public static AppCompatActivity provideActivity(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideActivity());
  }
}
