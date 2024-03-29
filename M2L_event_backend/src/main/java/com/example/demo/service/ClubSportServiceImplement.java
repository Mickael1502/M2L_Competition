package com.example.demo.service;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ClubSportDTO;
import com.example.demo.dto.SportDTO;
import com.example.demo.entity.ClubSport;
import com.example.demo.entity.sport;
import com.example.demo.repository.ClubSportRepository;

@Service
public  class ClubSportServiceImplement implements ClubSportService {

	
	
	@Autowired
	ClubSportRepository clubSportRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public ClubSportDTO ClubSportById(Long id) {
		// TODO Auto-generated method stub
		return convertClubSportToDto(clubSportRepository.findById(id).get());
	}
	

	@Override
	public List<ClubSportDTO> findAllClubSport() {
		// TODO Auto-generated method stub
		return clubSportRepository.findAll().stream().map(this::convertClubSportToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ClubSportDTO saveClubSport(ClubSportDTO CS) {
		// TODO Auto-generated method stub
		return convertClubSportToDto( clubSportRepository.save(convertDtoToClubSPort(CS)));
	}

	@Override
	public ClubSportDTO updateClubSport(ClubSportDTO CS) {
		// TODO Auto-generated method stub
		return convertClubSportToDto(clubSportRepository.save(convertDtoToClubSPort(CS)));

	}

	@Override
	public void deleteClubSportById(Long id) {
		// TODO Auto-generated method stub
		clubSportRepository.deleteById(id);
	}

	@Override
	public void deleteClubSport(ClubSport CS) {
		// TODO Auto-generated method stub
		clubSportRepository.delete(CS);
	}
	
	@Override
	public ClubSportDTO convertClubSportToDto(ClubSport clubSport) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	ClubSportDTO clubSportDTO = modelMapper.map(clubSport, ClubSportDTO.class);
	 return clubSportDTO ;
	}
	@Override
	public ClubSport convertDtoToClubSPort(ClubSportDTO csDto) {
		ClubSport produit = new ClubSport();
	produit = modelMapper.map(csDto, ClubSport.class);
	return produit ;
	}


	@Override
	public  List<ClubSportDTO> findClubSportBySport(Long id) {
		return   clubSportRepository.findClubSportBySportId(id).stream().map(this::convertClubSportToDto)
				.collect(Collectors.toList());  
	}
}
