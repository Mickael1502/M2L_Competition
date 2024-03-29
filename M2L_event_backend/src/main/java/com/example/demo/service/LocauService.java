package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.LocauDto;
import com.example.demo.entity.Locau;


public interface LocauService {
	
		LocauDto findLocauById(Long id);
		List<LocauDto> findLocauAll();
		LocauDto saveLocau(LocauDto entity);
		LocauDto updateLocau(LocauDto entity);
		void deleteByIdLocau(Long id);
		void deleteLocau(Locau entity);
		List<LocauDto> findByNumBureau( int num_bureau );
		
		LocauDto convertLocauToDto (Locau locau);
		Locau convertDtoToLocau (LocauDto locauDto);

}
