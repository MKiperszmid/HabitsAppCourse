// Generated by Dagger (https://dagger.dev).
package com.mkiperszmid.core_data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.MainCoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.mkiperszmid.core_data.di.MainDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DispatchersModule_ProvideMainDispatcherFactory implements Factory<MainCoroutineDispatcher> {
  @Override
  public MainCoroutineDispatcher get() {
    return provideMainDispatcher();
  }

  public static DispatchersModule_ProvideMainDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainCoroutineDispatcher provideMainDispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.provideMainDispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvideMainDispatcherFactory INSTANCE = new DispatchersModule_ProvideMainDispatcherFactory();
  }
}