package com.luftsoft.examandroid.App;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    public static App instance;

    public static App getInstance(){
        return instance;
    }

    public static Context getContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        instance=this;
        super.onCreate();
    }
}
