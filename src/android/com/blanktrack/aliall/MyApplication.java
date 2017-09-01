package com.blanktrack.aliall;

import android.app.Application;

import static com.blanktrack.alipush.PushPlugin.initCloudChannel;

/**
 * Created by Blank on 2017-08
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initCloudChannel(this);
        initHotfix(this);
    }

}
