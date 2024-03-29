package com.example.demo.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class ClubSport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nom;
	private int tel;
	private String mail;
	private String siret;
	private String adresse;
	private String ville;
	private String region;
	
	@ManyToOne
	@JoinColumn (name="locau_id")
	private Locau locau;
	
	@ManyToOne
	private sport sport;
	
	@OneToMany (mappedBy = "clubSport")
	private List<Newsletter> newsletter;
	
	@OneToMany (mappedBy = "clubSport")
	private List<Competition> competiton;
	
	@OneToMany (mappedBy = "club")
	private List<User> user;
	
	
	public sport getSport() {
		return sport;
	}

	public void setSport(sport sport) {
		this.sport = sport;
	}

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

	public ClubSport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClubSport( String nom, int tel, String mail, String siret, String adresse, String ville,
			String region, Locau locau) {
		super();
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
		this.adresse = adresse;
		this.ville = ville;
		this.region = region;
		
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

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
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
	
	public Locau getLocau() {
		return locau;
	}
	public void setLocau(Locau locau) {
		this.locau = locau;
	}

	@Override
	public String toString() {
		return "ClubSport [id=" + id + ", nom=" + nom ;
	}
	
	/*+ ", tel=" + tel + ", mail=" + mail + ", siret=" + siret
	+ ", adresse=" + adresse + ", ville=" + ville + ", region=" + region + ", locau=" + locau
	+ ", newsletter=" + newsletter + ", competiton=" + competiton + ", user=" + user + "]*/
	
}
