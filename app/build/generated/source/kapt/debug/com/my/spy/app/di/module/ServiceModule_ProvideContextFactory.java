package com.my.spy.app.di.module;

import android.content.Context;
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
public final class ServiceModule_ProvideContextFactory implements Factory<Context> {
  private final ServiceModule module;

  public ServiceModule_ProvideContextFactory(ServiceModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ServiceModule_ProvideContextFactory create(ServiceModule module) {
    return new ServiceModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ServiceModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}
