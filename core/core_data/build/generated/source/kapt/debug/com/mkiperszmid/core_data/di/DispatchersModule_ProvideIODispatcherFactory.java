// Generated by Dagger (https://dagger.dev).
package com.mkiperszmid.core_data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.mkiperszmid.core_data.di.IoDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DispatchersModule_ProvideIODispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideIODispatcher();
  }

  public static DispatchersModule_ProvideIODispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideIODispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.provideIODispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvideIODispatcherFactory INSTANCE = new DispatchersModule_ProvideIODispatcherFactory();
  }
}
