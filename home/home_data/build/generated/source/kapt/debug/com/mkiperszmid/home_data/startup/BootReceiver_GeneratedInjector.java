package com.mkiperszmid.home_data.startup;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = BootReceiver.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface BootReceiver_GeneratedInjector {
  void injectBootReceiver(BootReceiver bootReceiver);
}
