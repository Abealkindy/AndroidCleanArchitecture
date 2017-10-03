package com.rosinante24.androidcleanarchitecture.Home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rosinante24.androidcleanarchitecture.Base.BaseApp;
import com.rosinante24.androidcleanarchitecture.Models.CityListData;
import com.rosinante24.androidcleanarchitecture.Models.CityListResponse;
import com.rosinante24.androidcleanarchitecture.Network.Service;
import com.rosinante24.androidcleanarchitecture.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseApp implements HomeView {

    @BindView(R.id.recycler_activity_home)
    RecyclerView recyclerActivityHome;
    @BindView(R.id.progress_bar_activity_home)
    ProgressBar progressBarActivityHome;
    @Inject
    public Service service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getDeps().inject(this);

        renderView();
        init();

        HomePresenter presenter = new HomePresenter(service, this);
        presenter.getCityList();
    }

    public void renderView() {
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    public void init() {
        recyclerActivityHome.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showWait() {

        progressBarActivityHome.setVisibility(View.VISIBLE);

    }

    @Override
    public void removeWait() {
        progressBarActivityHome.setVisibility(View.GONE);
    }

    @Override
    public void onFailure(String appErrorMessage) {

    }

    @Override
    public void getityListSuccess(CityListResponse cityListResponse) {

        HomeAdapter adapter = new HomeAdapter(getApplicationContext(), cityListResponse.getData(),
                new HomeAdapter.OnItemClickListener() {
                    @Override
                    public void onClick(CityListData Item) {
                        Toast.makeText(getApplicationContext(), Item.getName(),
                                Toast.LENGTH_LONG).show();
                    }
                });

        recyclerActivityHome.setAdapter(adapter);
    }
}
