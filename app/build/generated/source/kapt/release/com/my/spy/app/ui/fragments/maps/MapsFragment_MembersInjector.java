package com.my.spy.app.ui.fragments.maps;

import com.google.android.gms.maps.SupportMapFragment;
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
public final class MapsFragment_MembersInjector implements MembersInjector<MapsFragment> {
  private final Provider<SupportMapFragment> mapsFragmentProvider;

  private final Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider;

  public MapsFragment_MembersInjector(Provider<SupportMapFragment> mapsFragmentProvider,
      Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider) {
    this.mapsFragmentProvider = mapsFragmentProvider;
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<MapsFragment> create(
      Provider<SupportMapFragment> mapsFragmentProvider,
      Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider) {
    return new MapsFragment_MembersInjector(mapsFragmentProvider, interactorProvider);
  }

  @Override
  public void injectMembers(MapsFragment instance) {
    injectMapsFragment(instance, mapsFragmentProvider.get());
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.maps.MapsFragment.mapsFragment")
  public static void injectMapsFragment(MapsFragment instance, SupportMapFragment mapsFragment) {
    instance.mapsFragment = mapsFragment;
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.maps.MapsFragment.interactor")
  public static void injectInteractor(MapsFragment instance,
      InterfaceInteractorMaps<InterfaceViewMaps> interactor) {
    instance.interactor = interactor;
  }
}
