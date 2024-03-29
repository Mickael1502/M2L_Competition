package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClubSportDTO;
import com.example.demo.entity.ClubSport;
import com.example.demo.service.ClubSportServiceImplement;

@RestController
@RequestMapping("/api/clubsport")
@CrossOrigin
public class ClubSportRestControllers {

	@Autowired
	ClubSportServiceImplement clubSportService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public List<ClubSportDTO> getAllClubSport(){
		return clubSportService.findAllClubSport();
	}
	
	@RequestMapping(value="getBy/{id}",method = RequestMethod.GET)
	public ClubSportDTO getClubSportById(@PathVariable("id") Long id) {
	return clubSportService.ClubSportById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ClubSportDTO createClubSport(@RequestBody ClubSportDTO clubSport) {
	return clubSportService.saveClubSport(clubSport);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public ClubSportDTO updateClubSport(@RequestBody ClubSportDTO clubSport) {
	return clubSportService.updateClubSport(clubSport);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteClubSport(@PathVariable("id") Long id){
		clubSportService.deleteClubSportById(id);
	}
	
	@RequestMapping(value="getBySport/{id}",method=RequestMethod.GET)
	public List<ClubSportDTO> getClubSportBySport(@PathVariable Long id){
		return clubSportService.findClubSportBySport(id);
	}
	
	
	
	 
	
}
