package com.example.demo.dto;

import java.util.Collection;

import com.example.demo.entity.ClubSport;
import com.example.demo.entity.Competition;
import com.example.demo.entity.Newsletter;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDTO {

	private Long id;
	private String nom;
	private String email;
	private String mdp;
	private String region;
	private String ville;
	private String adresse;
	private String rue;
	

	private Collection<Competition> competition;  
	

	private Collection<Newsletter> newsletter; 

	private ClubSport club;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Collection<Competition> getCompetition() {
		return competition;
	}

	public void setCompetition(Collection<Competition> competition) {
		this.competition = competition;
	}

	public Collection<Newsletter> getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Collection<Newsletter> newsletter) {
		this.newsletter = newsletter;
	}

	public ClubSport getClub() {
		return club;
	}

	public void setClub(ClubSport club) {
		this.club = club;
	}
	
	
}
