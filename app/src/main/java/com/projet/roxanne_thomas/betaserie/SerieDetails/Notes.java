package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notes
{
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("mean")
    @Expose
    private Double mean;
    @SerializedName("user")
    @Expose
    private Integer user;

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Double getMean() {
        return mean;
    }
    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Integer getUser() {
        return user;
    }
    public void setUser(Integer user) {
        this.user = user;
    }
}
