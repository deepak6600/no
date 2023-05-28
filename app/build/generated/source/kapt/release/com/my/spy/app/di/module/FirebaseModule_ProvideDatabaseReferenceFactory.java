package com.my.spy.app.di.module;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
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
public final class FirebaseModule_ProvideDatabaseReferenceFactory implements Factory<DatabaseReference> {
  private final FirebaseModule module;

  private final Provider<FirebaseDatabase> databaseProvider;

  public FirebaseModule_ProvideDatabaseReferenceFactory(FirebaseModule module,
      Provider<FirebaseDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DatabaseReference get() {
    return provideDatabaseReference(module, databaseProvider.get());
  }

  public static FirebaseModule_ProvideDatabaseReferenceFactory create(FirebaseModule module,
      Provider<FirebaseDatabase> databaseProvider) {
    return new FirebaseModule_ProvideDatabaseReferenceFactory(module, databaseProvider);
  }

  public static DatabaseReference provideDatabaseReference(FirebaseModule instance,
      FirebaseDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideDatabaseReference(database));
  }
}
