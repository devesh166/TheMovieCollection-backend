package com.TheMovieCollectionbackend.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
public class UserId implements Serializable {
	@Column
	private int movieId;
	@Column
	private String emailId;
	
	public UserId() {

	}
	public UserId(int movieId, String emailId) {
		super();
		this.movieId = movieId;
		this.emailId = emailId;
	}

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + movieId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (movieId != other.movieId)
			return false;
		return true;
	}
	
}