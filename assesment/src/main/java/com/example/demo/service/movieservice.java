package com.example.demo.service;

import java.util.List;

import com.example.demo.entitys.movies;

public interface movieservice {

	public List<movies>getMovies();
	public movies addmovies(movies movies);
}
