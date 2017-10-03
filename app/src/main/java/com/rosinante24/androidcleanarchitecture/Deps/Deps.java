package com.rosinante24.androidcleanarchitecture.Deps;


import com.rosinante24.androidcleanarchitecture.Home.HomeActivity;
import com.rosinante24.androidcleanarchitecture.Network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
