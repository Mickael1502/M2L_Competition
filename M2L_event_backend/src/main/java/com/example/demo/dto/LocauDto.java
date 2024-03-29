package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.ClubSport;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocauDto {
	
	public LocauDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long id; 

	private int num_bureau;

	private boolean libre;
	

	private List<ClubSport> clubSport;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNum_bureau() {
		return num_bureau;
	}

	@Override
	public String toString() {
		return "LocauDto [id=" + id + ", num_bureau=" + num_bureau + ", libre=" + libre + "]";
	}

	public void setNum_bureau(int num_bureau) {
		this.num_bureau = num_bureau;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public List<ClubSport> getClubSport() {
		return clubSport;
	}

	public void setClubSport(List<ClubSport> clubSport) {
		this.clubSport = clubSport;
	}
	
}
