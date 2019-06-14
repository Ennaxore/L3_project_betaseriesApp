package com.projet.roxanne_thomas.betaserie.SerieDetails;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details
{ @SerializedName("show")

    private Show show;
    @SerializedName("errors")

    private List<Object> errors = null;

    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }

    public List<Object> getErrors() {
        return errors;
    }
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @Override
    public String toString()
    {
        return "Show : " + show + "\nErreurs : " + errors;
    }
}