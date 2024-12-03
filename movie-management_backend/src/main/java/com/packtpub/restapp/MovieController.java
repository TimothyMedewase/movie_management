package com.packtpub.restapp;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.packtpub.model.entity.Movie;
import com.packtpub.service.MovieService;


@RestController
@RequestMapping("/movie")
public class MovieController{
	@Autowired
	MovieService movieService;
	@ResponseBody
	@RequestMapping("")
	public List <Movie> getAllUsers(){
		return movieService.getAllMovies();
	}
	
	@ResponseBody
	@RequestMapping("/{id}")
	public Movie getMovie(@PathVariable("id") Integer id){
		return movieService.getMovie(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method= RequestMethod.POST)
	public Map<String, Object> createMovie(
		@RequestParam(value="id")Integer id,
		@RequestParam(value= "title")String title,
		@RequestParam(value= "rating")String rating,
		@RequestParam(value= "releasedate")Date releasedate){
		Map<String, Object> map = new LinkedHashMap<>();
		movieService.createMovie(id, title, rating, releasedate);
		map.put("result", "added");
		return map;
	}
	@ResponseBody
	@RequestMapping(value = "", method= RequestMethod.PUT)
	public Map<String, Object> updateMovie(
			@RequestParam(value="id")Integer id,
			@RequestParam(value= "title")String title,
			@RequestParam(value= "rating")String rating,
			@RequestParam(value= "releasedate")Date releasedate){
		Map<String, Object> map = new LinkedHashMap<>();
		movieService.updateMovie(id, title, rating, releasedate);
		map.put("result", "updated");
		return map;
	}
	@ResponseBody
	@RequestMapping(value = "/{id}", method= RequestMethod.DELETE)
	public Map<String, Object> deleteUser(@PathVariable("id") Integer id){
		Map<String, Object> map = new LinkedHashMap<>();
		movieService.deleteMovie(id);
		map.put("result", "deleted");
		return map;
	}
	
}
