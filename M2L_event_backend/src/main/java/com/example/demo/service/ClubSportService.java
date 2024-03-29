package com.example.demo.service;
import java.util.List;


import com.example.demo.dto.ClubSportDTO;
import com.example.demo.dto.SportDTO;
import com.example.demo.entity.ClubSport;


public interface ClubSportService {

	ClubSportDTO ClubSportById(Long id);
	List<ClubSportDTO> findAllClubSport();
	ClubSportDTO saveClubSport(ClubSportDTO entity);
	ClubSportDTO updateClubSport (ClubSportDTO entity);
	void deleteClubSportById(Long id);
	void deleteClubSport(ClubSport id);
	ClubSportDTO convertClubSportToDto(ClubSport clubSport);
	ClubSport convertDtoToClubSPort(ClubSportDTO csDto);
	
	List<ClubSportDTO> findClubSportBySport(Long id);
}
