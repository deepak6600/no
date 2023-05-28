package com.my.spy.app.ui.activities.mainchild;

import com.my.spy.app.data.rxFirebase.InterfaceFirebase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainChildActivity_MembersInjector implements MembersInjector<MainChildActivity> {
  private final Provider<InterfaceFirebase> firebaseProvider;

  public MainChildActivity_MembersInjector(Provider<InterfaceFirebase> firebaseProvider) {
    this.firebaseProvider = firebaseProvider;
  }

  public static MembersInjector<MainChildActivity> create(
      Provider<InterfaceFirebase> firebaseProvider) {
    return new MainChildActivity_MembersInjector(firebaseProvider);
  }

  @Override
  public void injectMembers(MainChildActivity instance) {
    injectFirebase(instance, firebaseProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.activities.mainchild.MainChildActivity.firebase")
  public static void injectFirebase(MainChildActivity instance, InterfaceFirebase firebase) {
    instance.firebase = firebase;
  }
}
