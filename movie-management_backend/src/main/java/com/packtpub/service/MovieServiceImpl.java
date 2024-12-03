package com.packtpub.service;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.packtpub.model.entity.Movie;
import com.packtpub.model.repository.MovieRepository;
@Service
public class MovieServiceImpl implements MovieService{

	
	@Autowired
	MovieRepository movieRepository;
	
	
	@Override
	public List <Movie> getAllMovies(){
		return movieRepository.findAll();	}
	
	
	@Override
	public Movie getMovie(Integer id) {
		Optional <Movie> result = movieRepository.findById(id);
		if (!result.isPresent()) {
			return null;
		}
		return result.get();
	}
	
	@Override
	public void updateMovie(Integer id, String title, String rating, Date releasedate) {
		Optional <Movie> result = movieRepository.findById(id);
		if (result != null) {
			Movie movie = result.get();
			if (movie != null) {
				movie.setTitle(title);
				movie.setRating(rating);
				movie.setReleaseDate(releasedate);
				movieRepository.saveAndFlush(movie);
			}
		}
	}
	
	@Override
	public void deleteMovie(Integer id) {
		movieRepository.deleteById(id);
	}
	
//	@Override
	public void createMovie(Integer id, String title, String rating, Date releasedate) {
		Movie movieToInsert = new Movie(id, title, rating, releasedate);
		movieRepository.saveAndFlush(movieToInsert);
	}
//	public static List<User> users;
//	public UserServiceImpl() {
//		users = new LinkedList<>();
//		users.add(new User(100, "David"));
//		users.add(new User(101, "Peter"));
//		users.add(new User(102, "John"));
//		}
}