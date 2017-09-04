package com.blanktrack.aliall;

import android.app.Application;

import static com.blanktrack.aliall.PushPlugin.initCloudChannel;
import static com.blanktrack.aliall.PushPlugin.initHotfix;

/**
 * Created by Blank on 2017-08-28.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initHotfix(this);
        initCloudChannel(this);
    }
}