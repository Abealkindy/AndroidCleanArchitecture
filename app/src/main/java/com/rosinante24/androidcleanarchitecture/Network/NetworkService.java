package com.rosinante24.androidcleanarchitecture.Network;


import com.rosinante24.androidcleanarchitecture.Models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
