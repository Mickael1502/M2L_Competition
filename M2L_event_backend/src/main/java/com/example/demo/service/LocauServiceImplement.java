package com.example.demo.service;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LocauDto;
import com.example.demo.entity.Locau;
import com.example.demo.repository.LocauRepository;

@Service
public class LocauServiceImplement  implements LocauService {
	
	@Autowired
	LocauRepository locauRepository;

	@Override
	public LocauDto findLocauById(Long id) {
		// TODO Auto-generated method stub
		return convertLocauToDto(locauRepository.findById(id).get());
	}

	@Override
	public List<LocauDto> findLocauAll() {
		// TODO Auto-generated method stub
		return locauRepository.findLocauAll().stream()
				.map(this::convertLocauToDto)
				.collect(Collectors.toList());

	}

	@Override
	public LocauDto saveLocau(LocauDto L) {
		// TODO Auto-generated method stub
		return convertLocauToDto(locauRepository.save(convertDtoToLocau(L)));
	}

	@Override
	public LocauDto updateLocau(LocauDto L) {
		// TODO Auto-generated method stub
		return convertLocauToDto(locauRepository.save(convertDtoToLocau(L)));
	}

	@Override
	public void deleteByIdLocau(Long id) {
		// TODO Auto-generated method stub
		locauRepository.deleteById(id);
	}

	@Override
	public void deleteLocau(Locau L) {
		// TODO Auto-generated method stub
		locauRepository.delete(L);
	}

	@Override
	public List<LocauDto> findByNumBureau(int num_bureau) {
		// TODO Auto-generated method stub
		return locauRepository.findByNumBureau(num_bureau).stream().filter(li -> li.getLibre() == true).map(this::convertLocauToDto).collect(Collectors.toList());
	}
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public LocauDto convertLocauToDto(Locau locau) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	LocauDto locauDto = modelMapper.map(locau, LocauDto.class);
	 return locauDto ;
	}
	@Override
	public Locau convertDtoToLocau(LocauDto locauDto) {
	Locau locau = new Locau();
	locau = modelMapper.map(locauDto, Locau.class);
	return locau ;
	}



	
}

