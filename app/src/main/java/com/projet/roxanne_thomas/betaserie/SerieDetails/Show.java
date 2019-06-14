package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Show
{
    @SerializedName("id")

    private Integer id;
    @SerializedName("thetvdb_id")

    private Integer thetvdbId;
    @SerializedName("imdb_id")

    private String imdbId;
    @SerializedName("title")

    private String title;
    @SerializedName("original_title")

    private String originalTitle;
    @SerializedName("description")

    private String description;
    @SerializedName("seasons")

    private String seasons;
    @SerializedName("seasons_details")

    private List<SeasonsDetail> seasonsDetails = null;
    @SerializedName("episodes")

    private String episodes;
    @SerializedName("followers")

    private String followers;
    @SerializedName("comments")

    private String comments;
    @SerializedName("similars")

    private String similars;
    @SerializedName("characters")

    private String characters;
    @SerializedName("creation")

    private String creation;
    @SerializedName("genres")

    private List<String> genres = null;
    @SerializedName("length")

    private String length;
    @SerializedName("network")

    private String network;
    @SerializedName("rating")

    private String rating;
    @SerializedName("status")

    private String status;
    @SerializedName("language")

    private String language;
    @SerializedName("notes")

    private Notes notes;
    @SerializedName("in_account")

    private Boolean inAccount;
    @SerializedName("images")

    private Images images;
    @SerializedName("aliases")

    private Aliases aliases = null;
    @SerializedName("social_links")

    private List<Object> socialLinks = null;
    @SerializedName("user")

    private User user;
    @SerializedName("next_trailer")

    private Object nextTrailer;
    @SerializedName("resource_url")

    private String resourceUrl;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThetvdbId() {
        return thetvdbId;
    }
    public void setThetvdbId(Integer thetvdbId) {
        this.thetvdbId = thetvdbId;
    }

    public String getImdbId() {
        return imdbId;
    }
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeasons() {
        return seasons;
    }
    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public List<SeasonsDetail> getSeasonsDetails() {
        return seasonsDetails;
    }
    public void setSeasonsDetails(List<SeasonsDetail> seasonsDetails) {
        this.seasonsDetails = seasonsDetails;
    }

    public String getEpisodes() {
        return episodes;
    }
    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getFollowers() {
        return followers;
    }
    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSimilars() {
        return similars;
    }
    public void setSimilars(String similars) {
        this.similars = similars;
    }

    public String getCharacters() {
        return characters;
    }
    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getCreation() {
        return creation;
    }
    public void setCreation(String creation) {
        this.creation = creation;
    }

    public List<String> getGenres() {
        return genres;
    }
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }

    public String getNetwork() {
        return network;
    }
    public void setNetwork(String network) {
        this.network = network;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public Notes getNotes() {
        return notes;
    }
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Boolean getInAccount() {
        return inAccount;
    }
    public void setInAccount(Boolean inAccount) {
        this.inAccount = inAccount;
    }

    public Images getImages() {
        return images;
    }
    public void setImages(Images images) {
        this.images = images;
    }

    public Aliases getAliases() {
        return aliases;
    }
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    public List<Object> getSocialLinks() {
        return socialLinks;
    }
    public void setSocialLinks(List<Object> socialLinks) {
        this.socialLinks = socialLinks;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Object getNextTrailer() {
        return nextTrailer;
    }
    public void setNextTrailer(Object nextTrailer) {
        this.nextTrailer = nextTrailer;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", thetvdbId=" + thetvdbId +
                ", imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", description='" + description + '\'' +
                ", seasons='" + seasons + '\'' +
                ", seasonsDetails=" + seasonsDetails +
                ", episodes='" + episodes + '\'' +
                ", followers='" + followers + '\'' +
                ", comments='" + comments + '\'' +
                ", similars='" + similars + '\'' +
                ", characters='" + characters + '\'' +
                ", creation='" + creation + '\'' +
                ", genres=" + genres +
                ", length='" + length + '\'' +
                ", network='" + network + '\'' +
                ", rating='" + rating + '\'' +
                ", status='" + status + '\'' +
                ", language='" + language + '\'' +
                ", notes=" + notes +
                ", inAccount=" + inAccount +
                ", images=" + images +
                ", aliases=" + aliases +
                ", socialLinks=" + socialLinks +
                ", user=" + user +
                ", nextTrailer=" + nextTrailer +
                ", resourceUrl='" + resourceUrl + '\'' +
                '}';
    }
}

