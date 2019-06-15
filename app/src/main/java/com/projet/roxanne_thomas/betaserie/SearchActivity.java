package com.projet.roxanne_thomas.betaserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.betaseries.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(SerieCall.class);

        //callWSPopular();
    }

    /*public void callWSPopular() {
        service.popularSerie(){
            }
        });
    }*/
}
