package com.rosinante24.androidcleanarchitecture.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rosinante24.androidcleanarchitecture.Deps.DaggerDeps;
import com.rosinante24.androidcleanarchitecture.Deps.Deps;
import com.rosinante24.androidcleanarchitecture.Network.NetworkModule;

import java.io.File;

/**
 * Created by Rosinante24 on 03/10/17.
 */

public class BaseApp extends AppCompatActivity {

    Deps deps;

    public Deps getDeps() {
        return deps;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();

    }
}
