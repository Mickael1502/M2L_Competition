package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SportDTO;
import com.example.demo.entity.sport;
import com.example.demo.repository.SportRepository;
@Service
public class SportServiceImplement implements SportService {
	
	@Autowired
	SportRepository sportRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public SportDTO convertSportToDto(sport sport) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	SportDTO sportDTO = modelMapper.map(sport, SportDTO.class);
	 return sportDTO ;
	}
	
	@Override
	public sport convertDtoToSport(SportDTO sport) {
		sport produit = new sport();
	produit = modelMapper.map(sport,sport.class);
	return produit ;
	}

	
}
