package com.sinch.messagingtutorialskeleton;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;

/**
 * Created by mtsalis31 on 06-Jul-15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        //Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "GNsyBu7UWQ8qRkj5Xg0LhAydJ4QIVFafD5s0EOz0", "2YAQJ9GmIKtg2YuxB5UhcjiRHSjr6CE7pS3cyfYw");

    }
}
