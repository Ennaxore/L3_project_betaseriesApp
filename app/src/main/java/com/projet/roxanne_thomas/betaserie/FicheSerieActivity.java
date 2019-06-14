package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FicheSerieActivity  extends AppCompatActivity
{
    TextView tvTest;
    TextView tvTop20;
    TextView tvDetails;
    TextView tvSerieResume;

    Genres genres;
    Top20Series top20;
    Details details;
    int t =0;

    Retrofit retrofit;
    SerieCall service;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fiche_serie_activity);

        //Intent i = getIntent();
        //String token = i.getStringExtra("token");


        /*tvTest = findViewById(R.id.test);
        callWebservice();

        tvTop20 = findViewById(R.id.top_serie);
        callWSTop20();*/

        tvDetails = findViewById(R.id.serie_details);
        tvSerieResume = findViewById(R.id.tv_serie_resume);
         retrofit = new Retrofit.Builder()
                .baseUrl("https://api.betaseries.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
         service = retrofit.create(SerieCall.class);


        callWSSerieDetails();
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
                SerieCall service = retrofit.create(SerieCall.class);
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

            @Override
            protected void onPostExecute(Genres genresCall)
            {
                tvTest.setText(genresCall.toString());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void callWSTop20()
    {
        new AsyncTask<Void,Void,Top20Series>()
        {
            @Override
            protected Top20Series doInBackground(Void... voids)
            {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.betaseries.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                SerieCall service = retrofit.create(SerieCall.class);
                try
                {
                    top20 = service.showTop20().execute().body();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                return top20;
            }

            @Override
            protected void onPostExecute(Top20Series top20Call)
            {
                tvTop20.setText(top20Call.toString());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void callWSSerieDetails()
    {
        service.showDetails("121361").enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {
                tvDetails.setText(response.body().toString());
                tvSerieResume.setText((response.body().getShow().getDescription()));
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {

            }
        });

    }

}
