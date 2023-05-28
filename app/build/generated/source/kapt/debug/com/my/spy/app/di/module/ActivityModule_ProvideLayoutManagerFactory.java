package com.my.spy.app.di.module;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ActivityModule_ProvideLayoutManagerFactory implements Factory<LinearLayoutManager> {
  private final ActivityModule module;

  private final Provider<Context> contextProvider;

  public ActivityModule_ProvideLayoutManagerFactory(ActivityModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLayoutManager(module, contextProvider.get());
  }

  public static ActivityModule_ProvideLayoutManagerFactory create(ActivityModule module,
      Provider<Context> contextProvider) {
    return new ActivityModule_ProvideLayoutManagerFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLayoutManager(ActivityModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLayoutManager(context));
  }
}
