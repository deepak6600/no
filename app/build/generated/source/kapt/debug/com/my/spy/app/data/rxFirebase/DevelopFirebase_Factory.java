package com.my.spy.app.data.rxFirebase;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DevelopFirebase_Factory implements Factory<DevelopFirebase> {
  private final Provider<Context> contextProvider;

  private final Provider<FirebaseAuth> authProvider;

  private final Provider<DatabaseReference> dataRefProvider;

  private final Provider<StorageReference> stoRefProvider;

  public DevelopFirebase_Factory(Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider, Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    this.contextProvider = contextProvider;
    this.authProvider = authProvider;
    this.dataRefProvider = dataRefProvider;
    this.stoRefProvider = stoRefProvider;
  }

  @Override
  public DevelopFirebase get() {
    return newInstance(contextProvider.get(), authProvider.get(), dataRefProvider.get(), stoRefProvider.get());
  }

  public static DevelopFirebase_Factory create(Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider, Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    return new DevelopFirebase_Factory(contextProvider, authProvider, dataRefProvider, stoRefProvider);
  }

  public static DevelopFirebase newInstance(Context context, FirebaseAuth auth,
      DatabaseReference dataRef, StorageReference stoRef) {
    return new DevelopFirebase(context, auth, dataRef, stoRef);
  }
}
