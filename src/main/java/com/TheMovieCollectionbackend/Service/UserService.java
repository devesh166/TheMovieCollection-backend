package com.TheMovieCollectionbackend.Service;

import java.util.List;
import java.util.Optional;

import com.TheMovieCollectionbackend.Model.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TheMovieCollectionbackend.Model.FavouritesRepo;
import com.TheMovieCollectionbackend.Model.Favourites;

@Service
public class UserService {
	@Autowired
	private FavouritesRepo userdao;
	
	public void add(Favourites user) {
		 userdao.save(user);
	}
	
	public List<Favourites> getdata(String email){
		return (List<Favourites>) userdao.findByemailId(email);
	}

	public Optional<Favourites> getMovie(String emailId, int movieId){
		UserId user=new UserId(movieId,emailId);
		return userdao.findById(user);
	}
}