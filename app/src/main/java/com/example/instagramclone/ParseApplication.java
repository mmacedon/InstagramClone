package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register Parse Models
        ParseObject.registerSubclass(Post.class);
        // Add your initialization code here
        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mannysparsetagram") // should correspond to APP_ID env variable
                .clientKey("LucindaPrice")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://mannysparsetagram.herokuapp.com/parse").build());
    }
}
