package com.android.mvp.home;

import android.util.Log;

import com.android.mvp.OnActionCompleted;
import com.android.mvp.model.UserProfile;

/**
 * Created by DPM on 28-01-2018.
 */

public class HomeInterceptorImpl implements HomeInterceptor {
    private static final String TAG = HomeInterceptorImpl.class.getSimpleName();

    @Override
    public void downloadUserProfile(OnActionCompleted<UserProfile> onActionCompleted) {
        Log.i(TAG, "downloadUserProfile....intercepter");
        // TODO get data from web serive
        //TODO either get data from local data base

        // making manual delay, take care it either ui thread or background thread
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // creating fake data
        UserProfile userProfile = new UserProfile();
        userProfile.setUserName("Mike");

        onActionCompleted.actionCompleted(userProfile);
    }
}
