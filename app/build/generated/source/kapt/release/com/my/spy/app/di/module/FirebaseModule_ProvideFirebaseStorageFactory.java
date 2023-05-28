package com.my.spy.app.di.module;

import com.google.firebase.storage.FirebaseStorage;
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
public final class FirebaseModule_ProvideFirebaseStorageFactory implements Factory<FirebaseStorage> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFirebaseStorageFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseStorage get() {
    return provideFirebaseStorage(module);
  }

  public static FirebaseModule_ProvideFirebaseStorageFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFirebaseStorageFactory(module);
  }

  public static FirebaseStorage provideFirebaseStorage(FirebaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFirebaseStorage());
  }
}
