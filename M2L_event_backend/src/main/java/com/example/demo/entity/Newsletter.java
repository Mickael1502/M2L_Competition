package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Newsletter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateParution;
	private LocalDate dateFin;
	
	@ManyToOne
	@JoinColumn (name="clubSport_id")
	private ClubSport clubSport;
	
	@ManyToMany (mappedBy = "newsletter")
	 private Collection<User> User; 
	
	public Newsletter() {
		super();		// TODO Auto-generated constructor stub
	}
	
	public Newsletter(Long id, LocalDate dateParution, LocalDate dateFin) {
		super();
		this.id = id;
		this.dateParution = dateParution;
		this.dateFin = dateFin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDateParution() {
		return dateParution;
	}
	public void setDateParution(LocalDate dateParution) {
		this.dateParution = dateParution;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "Newsletter [id=" + id + ", dateParution=" + dateParution + ", dateFin=" + dateFin + ", clubSport="
				+ clubSport + ", User=" + User + "]";
	}
	
	

}
