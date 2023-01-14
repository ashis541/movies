package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitys.movies;
import com.example.demo.dao.*;
@Service
public class moviesimpl implements movieservice {
	@Autowired
	private moviesdao moviesdao;
	
	List<movies>list;
	public moviesimpl() {
		list=new ArrayList<>();
		list.add(new movies("jkdbjs","jwehf", "jkwbf", 0,"wjef"));
		list.add(new movies("jkdbjs","jwehf", "jkwbf", 1,"wjef"));
	}

	@Override
	public List<movies> getMovies() {
		return moviesdao.findAll();
		
	}

	@Override
	public movies addmovies(movies movies) {
		// TODO Auto-generated method stub
		moviesdao.save(movies);
		return movies ;
	}

}
