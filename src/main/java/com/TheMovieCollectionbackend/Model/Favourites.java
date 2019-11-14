package com.TheMovieCollectionbackend.Model;
 

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity(name = "UserFavourite")
@Table(name = "userfavourite")
@IdClass(UserId.class)
public class Favourites {
    @Id
    private int movieId;
    @Id
    private String emailId;

    @NotNull
    @Column(name = "my_json", columnDefinition = "json")
    @Convert(converter = JpaConverterJson.class)
	private Myjson movieObj;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Favourites(int movieId, String emailId, Myjson movieObj) {
        super();
        this.movieId = movieId;
        this.emailId = emailId;
        this.movieObj = movieObj;
    }

    public Myjson getMovieObj() {
        return movieObj;
    }

    public void setMovieObj(Myjson movieObj) {
        this.movieObj = movieObj;
    }

    public Favourites() {

    }

}
