package com.android.mvp.home;

import com.android.mvp.OnActionCompleted;
import com.android.mvp.model.UserProfile;

/**
 * Created by DPM on 28-01-2018.
 */

public interface HomeInterceptor {

    void downloadUserProfile(OnActionCompleted<UserProfile> onActionCompleted);

}
