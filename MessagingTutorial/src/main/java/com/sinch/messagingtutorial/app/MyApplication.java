package com.sinch.messagingtutorial.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "20cwrQc0RfAvyw13ERUx9OJ8Y6o8XNuQZpDaVYem", "yGdcaOk3fRN34PSGv6tshlzQ3BqKZrw5kjHL4maJ");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
