package com.my.spy.app.ui.activities.mainparent;

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
public final class MainParentActivity_MembersInjector implements MembersInjector<MainParentActivity> {
  private final Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> interactorParentProvider;

  public MainParentActivity_MembersInjector(
      Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    this.interactorParentProvider = interactorParentProvider;
  }

  public static MembersInjector<MainParentActivity> create(
      Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    return new MainParentActivity_MembersInjector(interactorParentProvider);
  }

  @Override
  public void injectMembers(MainParentActivity instance) {
    injectInteractorParent(instance, interactorParentProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.activities.mainparent.MainParentActivity.interactorParent")
  public static void injectInteractorParent(MainParentActivity instance,
      InterfaceInteractorMainParent<InterfaceViewMainParent> interactorParent) {
    instance.interactorParent = interactorParent;
  }
}
