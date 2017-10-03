package com.rosinante24.androidcleanarchitecture.Home;

import com.rosinante24.androidcleanarchitecture.Models.CityListResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(CityListResponse cityListResponse);

}
