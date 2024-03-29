package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.ClubSport;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class SportDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nom;
	
	@OneToMany (mappedBy = "sport")
	private List<ClubSport> club;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<ClubSport> getClub() {
		return club;
	}

	public void setClub(List<ClubSport> club) {
		this.club = club;
	}

}
