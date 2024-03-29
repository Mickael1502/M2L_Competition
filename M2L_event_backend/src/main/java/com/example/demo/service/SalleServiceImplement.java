package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SalleDTO;
import com.example.demo.entity.Salle;
import com.example.demo.repository.SalleRepository;

@Service
public class SalleServiceImplement implements SalleService {
	
	@Autowired
	SalleRepository salleRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public SalleDTO findSalleById(Long id) {
		// TODO Auto-generated method stub
		return convertSalleToDto(salleRepository.findById(id).get());
	}

	@Override
	public List<SalleDTO> findAllSalle() {
		// TODO Auto-generated method stub
		return salleRepository.findAll().stream()
				.map(this::convertSalleToDto)
				.collect(Collectors.toList());
	}

	@Override
	public SalleDTO saveSalle(SalleDTO S) {
		// TODO Auto-generated method stub
		return convertSalleToDto(salleRepository.save(convertDtoToSalle(S)));
	}

	@Override
	public SalleDTO updateSalle(SalleDTO S) {
		// TODO Auto-generated method stub
		return convertSalleToDto(salleRepository.save(convertDtoToSalle(S)));
	}

	@Override
	public void deleteSalleById(Long id) {
		// TODO Auto-generated method stub
		salleRepository.deleteById(id);
	}

	@Override
	public void deleteSalle(Salle S) {
		// TODO Auto-generated method stub
		salleRepository.delete(S);
	}
	@Override
	public SalleDTO convertSalleToDto(Salle S) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	SalleDTO clubSportDTO = modelMapper.map(S, SalleDTO.class);
	 return clubSportDTO ;
	}
	@Override
	public Salle convertDtoToSalle(SalleDTO SDto) {
		Salle produit = new Salle();
	produit = modelMapper.map(SDto, Salle.class);
	return produit ;

}


}
