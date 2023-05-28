package com.my.spy.app.di.module;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import com.my.spy.app.data.rxFirebase.InterfaceFirebase;
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
public final class FirebaseModule_ProvideInterfaceFirebaseFactory implements Factory<InterfaceFirebase> {
  private final FirebaseModule module;

  private final Provider<Context> contextProvider;

  private final Provider<FirebaseAuth> authProvider;

  private final Provider<DatabaseReference> dataRefProvider;

  private final Provider<StorageReference> stoRefProvider;

  public FirebaseModule_ProvideInterfaceFirebaseFactory(FirebaseModule module,
      Provider<Context> contextProvider, Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider, Provider<StorageReference> stoRefProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.authProvider = authProvider;
    this.dataRefProvider = dataRefProvider;
    this.stoRefProvider = stoRefProvider;
  }

  @Override
  public InterfaceFirebase get() {
    return provideInterfaceFirebase(module, contextProvider.get(), authProvider.get(), dataRefProvider.get(), stoRefProvider.get());
  }

  public static FirebaseModule_ProvideInterfaceFirebaseFactory create(FirebaseModule module,
      Provider<Context> contextProvider, Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider, Provider<StorageReference> stoRefProvider) {
    return new FirebaseModule_ProvideInterfaceFirebaseFactory(module, contextProvider, authProvider, dataRefProvider, stoRefProvider);
  }

  public static InterfaceFirebase provideInterfaceFirebase(FirebaseModule instance, Context context,
      FirebaseAuth auth, DatabaseReference dataRef, StorageReference stoRef) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceFirebase(context, auth, dataRef, stoRef));
  }
}
