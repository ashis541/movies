package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitys.movies;

public interface moviesdao extends JpaRepository<movies, String> {

}
