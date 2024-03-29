package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompetitionDTO;
import com.example.demo.entity.Competition;
import com.example.demo.service.CompetitionServiceImplement;

@RestController
@RequestMapping("/api/competition")
@CrossOrigin
public class CompetitionRestControllers {
	@Autowired
	CompetitionServiceImplement conpetitionService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public List<CompetitionDTO> getAllCompetition(){
		return conpetitionService.findAllCompetition();
	}
	
	@RequestMapping(value="getBy/{id}",method = RequestMethod.GET)
	public CompetitionDTO getCompetitionById(@PathVariable("id") Long id) {
	return conpetitionService.findCompetitionById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public CompetitionDTO createCompetition(@RequestBody CompetitionDTO competition) {
	return conpetitionService.saveCompetition(competition);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public CompetitionDTO updateCompetition(@RequestBody CompetitionDTO competition) {
	return conpetitionService.updateCompetition(competition);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteCompetition(@PathVariable("id") Long id){
		conpetitionService.deleteCompetitionById(id);
	}
}
