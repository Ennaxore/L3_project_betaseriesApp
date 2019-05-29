package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Next
{
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("date")
    @Expose
    private Object date;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("image")
    @Expose
    private Object image;

    public Object getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Object getDate() {
        return date;
    }
    public void setDate(Object date) {
        this.date = date;
    }

    public Object getTitle() {
        return title;
    }
    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getImage() {
        return image;
    }
    public void setImage(Object image) {
        this.image = image;
    }
}
