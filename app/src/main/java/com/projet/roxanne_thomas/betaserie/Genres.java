package com.projet.roxanne_thomas.betaserie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Genres
{
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "Voici la liste des genres des séries répertoriées : " + genres;
    }
}
