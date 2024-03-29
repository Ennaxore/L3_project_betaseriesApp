package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FicheSerieActivity extends AppCompatActivity {
    TextView tvTest;
    TextView tvTop20;

    TextView tvDetails;
    TextView tvSerieResume;
    TextView tvTitle;
    TextView tvStatut;
    TextView tvSeason;
    TextView tvEpisode;


    Genres genres;
    Top20Series top20;
    Details details;
    int t = 0;

    Retrofit retrofit;
    SerieCall service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        tvTitle = findViewById(R.id.tv_title);
        tvStatut = findViewById(R.id.tv_statut);
        tvSeason = findViewById(R.id.tv_season_number);
        tvEpisode = findViewById(R.id.tv_episode_number);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.betaseries.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(SerieCall.class);


        callWSSerieDetails();
    }

    public void callWebservice() {
        new AsyncTask<Void, Void, Genres>() {
            @Override
            protected Genres doInBackground(Void... voids) {
                // Création d'un objet rétrofit
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.betaseries.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                SerieCall service = retrofit.create(SerieCall.class);
                try {
                    genres = service.showGender().execute().body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return genres;
            }

            @Override
            protected void onPostExecute(Genres genresCall) {
                tvTest.setText(genresCall.toString());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void callWSTop20() {
        new AsyncTask<Void, Void, Top20Series>() {
            @Override
            protected Top20Series doInBackground(Void... voids) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.betaseries.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                SerieCall service = retrofit.create(SerieCall.class);
                try {
                    top20 = service.showTop20().execute().body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return top20;
            }

            @Override
            protected void onPostExecute(Top20Series top20Call) {
                tvTop20.setText(top20Call.toString());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void callWSSerieDetails() {
        service.showDetails("121361").enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {
                tvDetails.setText(response.body().toString());
                tvSerieResume.setText((response.body().getShow().getDescription()));
                tvTitle.setText(response.body().getShow().getTitle());
                tvStatut.setText(response.body().getShow().getStatus());

                if(Integer.parseInt(response.body().getShow().getSeasons()) > 1)
                {
                    tvSeason.setText(response.body().getShow().getSeasons()+" saisons");
                }
                else
                {
                    tvSeason.setText(response.body().getShow().getSeasons()+" saison");
                }

                if(Integer.parseInt(response.body().getShow().getSeasons()) > 1)
                {
                    tvEpisode.setText(response.body().getShow().getEpisodes() + " épisodes");
                }
                else
                {
                    tvEpisode.setText(response.body().getShow().getEpisodes() + " épisode");
                }
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {

            }
        });
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
}
