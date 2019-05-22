package com.projet.roxanne_thomas.betaserie;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.io.IOException;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FicheSerieActivity  extends AppCompatActivity
{
    TextView tvTest;
    Genres genres;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fiche_serie_activity);

        tvTest = findViewById(R.id.test);
        callWebservice();
    }

    public void callWebservice()
    {
        new AsyncTask<Void,Void,Genres>()
        {
            @Override
            protected Genres doInBackground(Void... voids)
            {
                // Création d'un objet rétrofit
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.betaseries.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                BetaseriesCall service = retrofit.create(BetaseriesCall.class);
                try
                {
                    genres = service.showGender().execute().body();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                return genres;
            }
        }
    }
}
