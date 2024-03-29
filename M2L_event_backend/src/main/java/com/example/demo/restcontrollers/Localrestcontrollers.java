package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LocauDto;
import com.example.demo.entity.Locau;
import com.example.demo.service.LocauServiceImplement;

@RestController
@RequestMapping("/api/local")
@CrossOrigin
public class Localrestcontrollers {
	@Autowired
	LocauServiceImplement locauService;
	
	@RequestMapping( path="/all" ,method = RequestMethod.GET)
	public List<LocauDto> getAllLocau(){
		return locauService.findLocauAll();
	}
	
	@RequestMapping(value="/getBy/{id}",method = RequestMethod.GET)
	public LocauDto getLocauById(@PathVariable("id") Long id) {
	return locauService.findLocauById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public LocauDto createLocau(@RequestBody LocauDto local) {
	return locauService.saveLocau(local);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public LocauDto updateLocau(@RequestBody LocauDto local) {
	return locauService.updateLocau(local);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteLocau(@PathVariable("id") Long id){
	locauService.deleteByIdLocau(id);
	}
	
	
}
