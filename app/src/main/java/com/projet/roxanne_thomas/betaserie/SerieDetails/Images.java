package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images
{
    @SerializedName("show")
    @Expose
    private String show;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("box")
    @Expose
    private String box;
    @SerializedName("poster")
    @Expose
    private Object poster;

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

    public Object getPoster() {
        return poster;
    }

    public void setPoster(Object poster) {
        this.poster = poster;
    }
}
