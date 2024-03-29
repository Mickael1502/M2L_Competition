package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import com.example.demo.entity.ClubSport;
import com.example.demo.entity.Salle;
import com.example.demo.entity.User;

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


public class CompetitionDTO {
	
	private Long id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private LocalDateTime heureDebut;
	private LocalDateTime heureFin;
	private int nbrParticipant;
	
	
	private ClubSport clubSport;
	
	private Salle salle;
	
	
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


	public ClubSport getClubSport() {
		return clubSport;
	}


	public void setClubSport(ClubSport clubSport) {
		this.clubSport = clubSport;
	}


	public Salle getSalle() {
		return salle;
	}


	public void setSalle(Salle salle) {
		this.salle = salle;
	}


	public Collection<User> getUser() {
		return user;
	}


	public void setUser(Collection<User> user) {
		this.user = user;
	}


	private Collection<User> user;

}
