package com.projet.roxanne_thomas.betaserie;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Top20Series
{
    @SerializedName("posters")
    @Expose
    private List<String> posters = null;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;

    public List<String> getPosters()
    {
        return posters;
    }

    public void setPosters(List<String> posters)
    {
        this.posters = posters;
    }

    public List<Object> getErrors()
    {
        return errors;
    }

    public void setErrors(List<Object> errors)
    {
        this.errors = errors;
    }

    @Override
    public String toString()
    {
        return "Séries populaires en ce moment : " + posters;
    }
}
