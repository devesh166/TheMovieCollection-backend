package com.TheMovieCollectionbackend.Model;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FavouritesRepo extends CrudRepository<Favourites, UserId>{

	List<Favourites> findByemailId(String email);

}
