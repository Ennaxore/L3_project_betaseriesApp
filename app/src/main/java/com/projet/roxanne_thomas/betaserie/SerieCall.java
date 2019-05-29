package com.projet.roxanne_thomas.betaserie;

import com.projet.roxanne_thomas.betaserie.SerieDetails.Details;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface SerieCall
{
    @Headers({
            "X-BetaSeries-Version: 3.0",
            "X-BetaSeries-Key: dae7ecdb03b9"
    })
    @GET("/shows/genres")
    Call<Genres> showGender();


    @Headers({
            "X-BetaSeries-Version: 3.0",
            "X-BetaSeries-Key: dae7ecdb03b9"
    })
    @GET("/shows/posters")
    Call<Top20Series> showTop20();

    @Headers({
            "X-BetaSeries-Version: 3.0",
            "X-BetaSeries-Key: dae7ecdb03b9"
    })
    @GET("/shows/display?thetvdb_id=121361")
    Call<Details> showDetails();
}
