package com.rosinante24.androidcleanarchitecture.Network;


import com.rosinante24.androidcleanarchitecture.Models.CityListResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface NetworkService {

    @GET("get/filter/dataalam")
    Observable<CityListResponse> getCityList(
            @Query("kategori") int kategori
    );

}
