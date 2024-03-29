package com.example.demo.entity;

import java.util.Collection;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String email;
	private String mdp;
	private String region;
	private String ville;
	private String adresse;
	private String rue;
	
	@ManyToMany (mappedBy = "user")
	 private Collection<Competition> competition; 
	
	@ManyToMany 
	@JoinTable(name = "newsletter_id")
	private Collection<Newsletter> newsletter;
	
	@ManyToOne
    @JoinColumn(name = "club_id")
	private ClubSport club;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Long id, String nom, String email, String mdp, String region, String ville, String adresse,
			String rue) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
		this.region = region;
		this.ville = ville;
		this.adresse = adresse;
		this.rue = rue;
	}
	
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

	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", email=" + email + ", mdp=" + mdp + ", region=" + region
				+ ", ville=" + ville + ", adresse=" + adresse + ", rue=" + rue + ", competition=" + competition
				+ ", newsletter=" + newsletter + ", club=" + club + "]";
	}
	
	
}
