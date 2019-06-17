package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {

    Retrofit retrofit;
    SerieCall service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);
    }

    public void goToAccount(View v)
    {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void goToSearch(View v)
    {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void goToSeries(View v)
    {
        Intent intent = new Intent(this, MySerie.class);
        startActivity(intent);
    }

    public void goToGOT(View view)
    {
        Intent intent = new Intent(this, FicheSerieActivity.class);
        startActivity(intent);
    }
}
