package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CompetitionDTO;
import com.example.demo.entity.Competition;

public interface CompetitionService {

	CompetitionDTO findCompetitionById(Long id);
	List<CompetitionDTO> findAllCompetition();
	CompetitionDTO saveCompetition(CompetitionDTO entity);
	CompetitionDTO updateCompetition (CompetitionDTO entity);
	void deleteCompetitionById(Long id);
	void deleteCompetition(Competition id);
	Competition convertDtoToCompetition(CompetitionDTO CDto);
	CompetitionDTO convertCompetitionToDto(Competition C);
}
