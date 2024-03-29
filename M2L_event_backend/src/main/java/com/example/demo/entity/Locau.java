package com.example.demo.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.springframework.data.rest.core.config.Projection;

@Entity
public class Locau {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column(name = "num_bureau")
	private int num_bureau;
	@Column(name = "libre")
	private boolean libre;
	
	@JsonIgnore
	@OneToMany (mappedBy = "locau")
	private List<ClubSport> clubSport;
	
	
public Locau() {
		super();
		// TODO Auto-generated constructor stub
	}



public Locau( int num_bureau, Boolean libre) {
		super();
		this.num_bureau = num_bureau;
		this.libre = libre;
	}



public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getNumBureau() {
		return num_bureau;
	}



	public void setNumBureau(int num_bureau) {
		this.num_bureau = num_bureau;
	}



	public boolean getLibre() {
		return libre;
	}



	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	@Projection(name = "Local", types = { Locau.class })
	public interface LocauProjection {
	public int getNumBureau();
	}




@Override 
public String toString() {
	return "-" + id + "\n" + "-" + num_bureau + "\n" + "-" + libre;
}
}
 