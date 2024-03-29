package com.example.demo.service;

import com.example.demo.dto.SportDTO;
import com.example.demo.entity.sport;

public interface SportService {
	
	SportDTO convertSportToDto(sport sport);
	sport convertDtoToSport(SportDTO sport);

}
