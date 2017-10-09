package com.rosinante24.androidcleanarchitecture.Network;


import com.rosinante24.androidcleanarchitecture.Models.CityListResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface NetworkService {

    @GET("popular")
    Observable<CityListResponse> getCityList(
            @Query("api_key") String kategori
    );

}
