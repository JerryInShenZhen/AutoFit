package com.xormedia.autofit;

import android.app.Application;

import com.bing.autofit.AutoFit;

/**
 * Created by Bing on 2018/2/1.
 */

public class MyApplaction extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    AutoFit.Init(this,1080,1920);
  }
}
