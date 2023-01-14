package com.example.demo.entitys;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ratings {

@Id
	
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "tconst")
    private movies movies;
	
	
	private int averageRating;
	private int numVotes;

	
   
	public ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ratings(int averageRating, int numVotes, com.example.demo.entitys.movies movies) {
		super();
		this.averageRating = averageRating;
		this.numVotes = numVotes;
		this.movies = movies;
	}
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	public int getNumVotes() {
		return numVotes;
	}
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}
	public movies getMovies() {
		return movies;
	}
	public void setMovies(movies movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "ratings [averageRating=" + averageRating + ", numVotes=" + numVotes + ", movies=" + movies + "]";
	}
    
   

}
