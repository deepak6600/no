package com.my.spy.app.di.module;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
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
public final class FirebaseModule_ProvideStorageReferenceFactory implements Factory<StorageReference> {
  private final FirebaseModule module;

  private final Provider<FirebaseStorage> storageProvider;

  public FirebaseModule_ProvideStorageReferenceFactory(FirebaseModule module,
      Provider<FirebaseStorage> storageProvider) {
    this.module = module;
    this.storageProvider = storageProvider;
  }

  @Override
  public StorageReference get() {
    return provideStorageReference(module, storageProvider.get());
  }

  public static FirebaseModule_ProvideStorageReferenceFactory create(FirebaseModule module,
      Provider<FirebaseStorage> storageProvider) {
    return new FirebaseModule_ProvideStorageReferenceFactory(module, storageProvider);
  }

  public static StorageReference provideStorageReference(FirebaseModule instance,
      FirebaseStorage storage) {
    return Preconditions.checkNotNullFromProvides(instance.provideStorageReference(storage));
  }
}
