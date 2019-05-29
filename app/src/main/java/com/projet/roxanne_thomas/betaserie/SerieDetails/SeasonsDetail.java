package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeasonsDetail
{
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("episodes")
    @Expose
    private Integer episodes;

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getEpisodes() {
        return episodes;
    }
    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }
}
