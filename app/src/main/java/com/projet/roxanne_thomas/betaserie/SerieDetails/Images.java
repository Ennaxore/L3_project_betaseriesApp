package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images
{
    @SerializedName("show")

    private String show;
    @SerializedName("banner")

    private String banner;
    @SerializedName("box")

    private String box;
    @SerializedName("poster")

    private String poster;

    public String getShow() {
        return show;
    }
    public void setShow(String show) {
        this.show = show;
    }

    public String getBanner() {
        return banner;
    }
    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getBox() {
        return box;
    }
    public void setBox(String box) {
        this.box = box;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
}
