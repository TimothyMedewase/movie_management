package com.packtpub.service;
import java.sql.Date;
import java.util.List;
import com.packtpub.model.entity.Movie;


public interface MovieService{
	List<Movie> getAllMovies();
	Movie getMovie(Integer id);
	void createMovie(Integer id, String title, String rating, Date releasedate);
	void updateMovie(Integer id, String title, String rating, Date releasedate);
	void deleteMovie(Integer id);

}