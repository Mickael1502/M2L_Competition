package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Competition;
import com.example.demo.entity.Locau;
import com.example.demo.entity.Newsletter;
import com.example.demo.entity.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ClubSportDTO {
	

    private Long id;
	private String nom;
	private int tel;
	private String mail;
	private String adresse;
	private String ville;
	private String region;
	
	//private Locau locau;
	
		private List<Newsletter> newsletter;

		private List<Competition> competiton;
		
		private List<User> user;
	public List<Newsletter> getNewsletter() {
			return newsletter;
		}
		public void setNewsletter(List<Newsletter> newsletter) {
			this.newsletter = newsletter;
		}
		public List<Competition> getCompetiton() {
			return competiton;
		}
		public void setCompetiton(List<Competition> competiton) {
			this.competiton = competiton;
		}
		public List<User> getUser() {
			return user;
		}
		public void setUser(List<User> user) {
			this.user = user;
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	

	

}
