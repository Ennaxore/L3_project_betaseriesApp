package com.projet.roxanne_thomas.betaserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionActivity extends AppCompatActivity {

    private Button goBackButton;
    private Button goSearchButton;

    Retrofit retrofit;
    UserCall service;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_activity);

        goBackButton = findViewById(R.id.go_back_button);
        goBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goBack();
            }
        });

        goSearchButton = findViewById(R.id.go_to_search_button);
        goSearchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goSearchBase();
            }
        });


        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.betaseries.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(UserCall.class);


        //callWSAuthMember();
    }

    public void goBack()
    {
        onBackPressed();
    }

    public void goSearchBase()
    {
        Intent ficheSerieActivity = new Intent(this, FicheSerieActivity.class);
        Bundle b = new Bundle();
        b.putString("token","ksdfjheakjvhnlkvjnalfekvjn");
        startActivity(ficheSerieActivity);
    }

    public void callWSAuthMember() {
        service.authentification("121361").enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {

            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {

            }
        });
    }
}
