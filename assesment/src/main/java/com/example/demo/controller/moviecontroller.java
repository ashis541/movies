package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.*;
import com.example.demo.entitys.movies;

@RestController
public class moviecontroller {
	
	@Autowired
	
	private movieservice movieservice;
	
	//get movies
	@GetMapping("/api/v1/longest-duration-movies")
	public List <movies>getmovies(){
		return this.movieservice.getMovies();
		
	}
	@PostMapping(path="/api/v1/new-movie",consumes = "application/json")
	public movies addmovies(@RequestBody movies movies) {
		return this.movieservice.addmovies(movies);
		
	}

}
