package com.projet.roxanne_thomas.betaserie.SerieDetails;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User
{
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("remaining")
    @Expose
    private Integer remaining;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("tags")
    @Expose
    private Object tags;
    @SerializedName("next")
    @Expose
    private Next next;
    @SerializedName("friends_watching")
    @Expose
    private List<Object> friendsWatching = null;

    public Boolean getArchived() {
        return archived;
    }
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getFavorited() {
        return favorited;
    }
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Integer getRemaining() {
        return remaining;
    }
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }

    public Object getTags() {
        return tags;
    }
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Next getNext() {
        return next;
    }
    public void setNext(Next next) {
        this.next = next;
    }

    public List<Object> getFriendsWatching() {
        return friendsWatching;
    }
    public void setFriendsWatching(List<Object> friendsWatching) {
        this.friendsWatching = friendsWatching;
    }

}
