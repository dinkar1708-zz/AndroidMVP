package com.android.mvp.home;

import com.android.mvp.OnActionCompleted;
import com.android.mvp.model.UserProfile;

/**
 * Created by DPM on 28-01-2018.
 */

public class HomePresenterImpl implements HomePresenter {

    private HomeView homeView;
    private HomeInterceptor homeInterceptor;

    public HomePresenterImpl(HomeView homeView, HomeInterceptor homeInterceptor) {
        this.homeView = homeView;
        this.homeInterceptor = homeInterceptor;
    }

    @Override
    public void downloadUserProfile() {
        homeView.showProgress();

        homeInterceptor.downloadUserProfile(new OnActionCompleted<UserProfile>() {
            @Override
            public void actionCompleted(UserProfile data) {

                homeView.userProfileDownloaded(data);

                homeView.hideProgress();
            }
        });
    }
}
