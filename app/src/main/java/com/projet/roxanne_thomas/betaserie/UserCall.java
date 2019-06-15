package com.projet.roxanne_thomas.betaserie;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface UserCall
{
    @Headers({
            "X-BetaSeries-Version: 3.0",
            "X-BetaSeries-Key: dae7ecdb03b9"
    })
    @GET("/members/auth")
    Call<Details> authentification(@Body String paramId);
}
