package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class Competition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private LocalDateTime heureDebut;
	private LocalDateTime heureFin;
	private int nbrParticipant;
	
	@ManyToOne
	@JoinColumn (name="clubSport_id")
	private ClubSport clubSport;
	
	@ManyToOne
	@JoinColumn (name="salle_id")
	private Salle salle;
	
	@ManyToMany 
	@JoinTable(name = "inscription")
	private Collection<User> user;
	
	
	public Competition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competition(Long id, LocalDate dateDebut, LocalDate dateFin, LocalDateTime heureDebut, LocalDateTime heureFin,
			int nbrParticipant) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.nbrParticipant = nbrParticipant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public LocalDateTime getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(LocalDateTime heureDebut) {
		this.heureDebut = heureDebut;
	}
	public LocalDateTime getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(LocalDateTime heureFin) {
		this.heureFin = heureFin;
	}
	public int getNbrParticipant() {
		return nbrParticipant;
	}
	public void setNbrParticipant(int nbrParticipant) {
		this.nbrParticipant = nbrParticipant;
	}
	
	
	
	

}
