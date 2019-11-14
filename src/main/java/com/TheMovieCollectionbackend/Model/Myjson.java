package com.TheMovieCollectionbackend.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class Myjson implements Serializable {
    @JsonProperty("adult")
    private boolean adult;
    @JsonProperty("backdrop_path")
    private String backdrop_path;
    @JsonProperty("genre_ids")
    private int[] genre_ids;
    @JsonProperty("id")
    private int id;
    @JsonProperty("original_language")
    private String original_language;
    @JsonProperty("original_title")
    private String original_title;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("popularity")
    private float popularity;
    @JsonProperty("poster_path")
    private String poster_path;
    @JsonProperty("release_date")
    private Date release_date;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private String video;
    @JsonProperty("vote_average")
    private float vote_average;
    @JsonProperty("vote_count")
    private int vote_count;

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setGenre_ids(int[] genre_ids) {
        this.genre_ids = genre_ids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }

    public int getId() {
        return id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public String getTitle() {
        return title;
    }

    public String getVideo() {
        return video;
    }

    public float getVote_average() {
        return vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }
}