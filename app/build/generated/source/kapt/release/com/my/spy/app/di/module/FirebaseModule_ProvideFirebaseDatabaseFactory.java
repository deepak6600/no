package com.my.spy.app.di.module;

import com.google.firebase.database.FirebaseDatabase;
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
public final class FirebaseModule_ProvideFirebaseDatabaseFactory implements Factory<FirebaseDatabase> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFirebaseDatabaseFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseDatabase get() {
    return provideFirebaseDatabase(module);
  }

  public static FirebaseModule_ProvideFirebaseDatabaseFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFirebaseDatabaseFactory(module);
  }

  public static FirebaseDatabase provideFirebaseDatabase(FirebaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFirebaseDatabase());
  }
}
