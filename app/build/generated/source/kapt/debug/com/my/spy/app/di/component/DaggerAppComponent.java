package com.my.spy.app.di.component;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import com.my.spy.app.app.powerapk;
import com.my.spy.app.data.rxFirebase.InterfaceFirebase;
import com.my.spy.app.di.module.AppModule;
import com.my.spy.app.di.module.AppModule_ProvideContextFactory;
import com.my.spy.app.di.module.FirebaseModule;
import com.my.spy.app.di.module.FirebaseModule_ProvideDatabaseReferenceFactory;
import com.my.spy.app.di.module.FirebaseModule_ProvideFirebaseAuthFactory;
import com.my.spy.app.di.module.FirebaseModule_ProvideFirebaseDatabaseFactory;
import com.my.spy.app.di.module.FirebaseModule_ProvideFirebaseStorageFactory;
import com.my.spy.app.di.module.FirebaseModule_ProvideInterfaceFirebaseFactory;
import com.my.spy.app.di.module.FirebaseModule_ProvideStorageReferenceFactory;
import com.my.spy.app.services.accessibilityData.AccessibilityDataService;
import com.my.spy.app.services.accessibilityData.AccessibilityDataService_MembersInjector;
import com.my.spy.app.services.accessibilityData.InteractorAccessibilityData;
import com.my.spy.app.services.notificationService.InteractorNotificationService;
import com.my.spy.app.services.notificationService.NotificationService;
import com.my.spy.app.services.notificationService.NotificationService_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppModule appModule;

    private FirebaseModule firebaseModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder firebaseModule(FirebaseModule firebaseModule) {
      this.firebaseModule = Preconditions.checkNotNull(firebaseModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      if (firebaseModule == null) {
        this.firebaseModule = new FirebaseModule();
      }
      return new AppComponentImpl(appModule, firebaseModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppModule appModule;

    private final FirebaseModule firebaseModule;

    private final AppComponentImpl appComponentImpl = this;

    private AppComponentImpl(AppModule appModuleParam, FirebaseModule firebaseModuleParam) {
      this.appModule = appModuleParam;
      this.firebaseModule = firebaseModuleParam;

    }

    private InteractorAccessibilityData interactorAccessibilityData() {
      return new InteractorAccessibilityData(AppModule_ProvideContextFactory.provideContext(appModule), getInterfaceFirebase());
    }

    private InteractorNotificationService interactorNotificationService() {
      return new InteractorNotificationService(AppModule_ProvideContextFactory.provideContext(appModule), getInterfaceFirebase());
    }

    private DatabaseReference databaseReference() {
      return FirebaseModule_ProvideDatabaseReferenceFactory.provideDatabaseReference(firebaseModule, FirebaseModule_ProvideFirebaseDatabaseFactory.provideFirebaseDatabase(firebaseModule));
    }

    private StorageReference storageReference() {
      return FirebaseModule_ProvideStorageReferenceFactory.provideStorageReference(firebaseModule, FirebaseModule_ProvideFirebaseStorageFactory.provideFirebaseStorage(firebaseModule));
    }

    @Override
    public void inject(powerapk app) {
    }

    @Override
    public void inject(AccessibilityDataService accessibilityDataService) {
      injectAccessibilityDataService(accessibilityDataService);
    }

    @Override
    public void inject(NotificationService notificationService) {
      injectNotificationService(notificationService);
    }

    @Override
    public InterfaceFirebase getInterfaceFirebase() {
      return FirebaseModule_ProvideInterfaceFirebaseFactory.provideInterfaceFirebase(firebaseModule, AppModule_ProvideContextFactory.provideContext(appModule), FirebaseModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(firebaseModule), databaseReference(), storageReference());
    }

    @CanIgnoreReturnValue
    private AccessibilityDataService injectAccessibilityDataService(
        AccessibilityDataService instance) {
      AccessibilityDataService_MembersInjector.injectInteractor(instance, interactorAccessibilityData());
      return instance;
    }

    @CanIgnoreReturnValue
    private NotificationService injectNotificationService(NotificationService instance) {
      NotificationService_MembersInjector.injectInteractor(instance, interactorNotificationService());
      return instance;
    }
  }
}
