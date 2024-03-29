package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SalleDTO;
import com.example.demo.entity.Salle;
import com.example.demo.service.SalleServiceImplement;

@RestController
@RequestMapping("/api/salle")
@CrossOrigin
public class SalleRestControllers {
	@Autowired
	SalleServiceImplement salleService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public List<SalleDTO> getAllSalle(){
		return salleService.findAllSalle();
	}
	
	@RequestMapping(value="getBy/{id}",method = RequestMethod.GET)
	public SalleDTO getSalleById(@PathVariable("id") Long id) {
	return salleService.findSalleById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public SalleDTO createSalle(@RequestBody SalleDTO salle) {
	return salleService.saveSalle(salle);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public SalleDTO updateSalle(@RequestBody SalleDTO salle) {
	return salleService.updateSalle(salle);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteSalle(@PathVariable("id") Long id){
		salleService.deleteSalleById(id);
	}
}

