package com.projet.roxanne_thomas.betaserie.SerieDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Show
{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("thetvdb_id")
    @Expose
    private Integer thetvdbId;
    @SerializedName("imdb_id")
    @Expose
    private String imdbId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("original_title")
    @Expose
    private String originalTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("seasons")
    @Expose
    private String seasons;
    @SerializedName("seasons_details")
    @Expose
    private List<SeasonsDetail> seasonsDetails = null;
    @SerializedName("episodes")
    @Expose
    private String episodes;
    @SerializedName("followers")
    @Expose
    private String followers;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("similars")
    @Expose
    private String similars;
    @SerializedName("characters")
    @Expose
    private String characters;
    @SerializedName("creation")
    @Expose
    private String creation;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("length")
    @Expose
    private String length;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("in_account")
    @Expose
    private Boolean inAccount;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("aliases")
    @Expose
    private List<Object> aliases = null;
    @SerializedName("social_links")
    @Expose
    private List<Object> socialLinks = null;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("next_trailer")
    @Expose
    private Object nextTrailer;
    @SerializedName("resource_url")
    @Expose
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

    public List<Object> getAliases() {
        return aliases;
    }
    public void setAliases(List<Object> aliases) {
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
}
