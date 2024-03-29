package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CompetitionDTO;
import com.example.demo.entity.Competition;
import com.example.demo.repository.CompetitionRepository;

@Service 
public class CompetitionServiceImplement implements CompetitionService {

	@Autowired
	CompetitionRepository competitionRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public CompetitionDTO findCompetitionById(Long id) {
		// TODO Auto-generated method stub
		return convertCompetitionToDto(competitionRepository.findById(id).get());
	}

	@Override
	public List<CompetitionDTO> findAllCompetition() {
		// TODO Auto-generated method stub
		return competitionRepository.findAll().stream().map(this::convertCompetitionToDto)
				.collect(Collectors.toList());
	}

	@Override
	public CompetitionDTO saveCompetition(CompetitionDTO C) {
		// TODO Auto-generated method stub
		return convertCompetitionToDto(competitionRepository.save(convertDtoToCompetition(C)));
	}

	@Override
	public CompetitionDTO updateCompetition(CompetitionDTO C) {
		// TODO Auto-generated method stub
		return convertCompetitionToDto(competitionRepository.save(convertDtoToCompetition(C)));
	}

	@Override
	public void deleteCompetitionById(Long id) {
		// TODO Auto-generated method stub
		competitionRepository.deleteById(id);
	}

	@Override
	public void deleteCompetition(Competition C) {
		// TODO Auto-generated method stub
		competitionRepository.delete(C);
	}
	
	@Override
	public CompetitionDTO convertCompetitionToDto(Competition C) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	CompetitionDTO clubSportDTO = modelMapper.map(C, CompetitionDTO.class);
	 return clubSportDTO ;
	}
	@Override
	public Competition convertDtoToCompetition(CompetitionDTO CDto) {
		Competition produit = new Competition();
	produit = modelMapper.map(CDto, Competition.class);
	return produit ;

}
}
