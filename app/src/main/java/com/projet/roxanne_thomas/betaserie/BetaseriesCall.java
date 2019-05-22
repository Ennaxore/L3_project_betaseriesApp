package com.projet.roxanne_thomas.betaserie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface BetaseriesCall
{
    @Headers({
            "X-BetaSeries-Version: 3.0",
            "X-BetaSeries-Key: dae7ecdb03b9"
    })
    @GET("/shows/genres")
    Call<Genres> showGender();
}
