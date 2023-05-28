package com.my.spy.app.ui.fragments.recording;

import androidx.recyclerview.widget.LinearLayoutManager;
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
public final class RecordingFragment_MembersInjector implements MembersInjector<RecordingFragment> {
  private final Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public RecordingFragment_MembersInjector(
      Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<RecordingFragment> create(
      Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new RecordingFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(RecordingFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.recording.RecordingFragment.interactor")
  public static void injectInteractor(RecordingFragment instance,
      InterfaceInteractorRecording<InterfaceViewRecording> interactor) {
    instance.interactor = interactor;
  }

  @InjectedFieldSignature("com.my.spy.app.ui.fragments.recording.RecordingFragment.layoutM")
  public static void injectLayoutM(RecordingFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
