package com.packtpub.model.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="movie")
public class Movie{
	
	@Id
	private Integer id;
	private String title;
	private String rating;
	private Date releasedate;
	
	
	public Movie() {}
	
	
	public Movie(Integer id, String title, String rating, Date releasedate ) {
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.releasedate = releasedate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Date getReleaseDate() {
		return releasedate;
	}
	public void setReleaseDate(Date releasedate) {
		this.releasedate= releasedate;
	}
	
}
