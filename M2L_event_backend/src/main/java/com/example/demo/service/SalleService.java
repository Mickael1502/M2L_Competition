package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SalleDTO;
import com.example.demo.entity.Salle;

public interface SalleService {
	
	SalleDTO findSalleById(Long id);
	List<SalleDTO> findAllSalle();
	SalleDTO saveSalle(SalleDTO entity);
	SalleDTO updateSalle (SalleDTO entity);
	void deleteSalleById(Long id);
	void deleteSalle(Salle id);
	Salle convertDtoToSalle(SalleDTO SDto);
	SalleDTO convertSalleToDto(Salle S);

}
