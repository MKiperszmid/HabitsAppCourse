package com.mkiperszmid.home_data.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_BootReceiver extends BroadcastReceiver {
  private volatile boolean injected = false;

  private final Object injectedLock = new Object();

  private final boolean onReceiveBytecodeInjectionMarker = false;

  @Override
  @CallSuper
  public void onReceive(Context context, Intent intent) {
    inject(context);
  }

  protected void inject(Context context) {
    if (!injected) {
      synchronized (injectedLock) {
        if (!injected) {
          ((BootReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectBootReceiver(UnsafeCasts.<BootReceiver>unsafeCast(this));
          injected = true;
        }
      }
    }
  }
}
