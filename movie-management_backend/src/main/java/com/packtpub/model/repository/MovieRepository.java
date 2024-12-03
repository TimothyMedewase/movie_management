package com.packtpub.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packtpub.model.entity.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
}