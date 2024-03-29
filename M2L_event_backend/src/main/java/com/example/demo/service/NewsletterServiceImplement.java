package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.NewsletterDTO;
import com.example.demo.entity.Newsletter ;
import com.example.demo.repository.NewsletterRepository;

@Service
public class NewsletterServiceImplement implements NewsletterService {

	@Autowired
	NewsletterRepository newsletterRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public NewsletterDTO findNewsletterById(Long id) {
		// TODO Auto-generated method stub
		return convertNewsToDto(newsletterRepository.findById(id).get());
	}

	@Override
	public List<NewsletterDTO> findAllNewsletter() {
		// TODO Auto-generated method stub
		return newsletterRepository.findAll().stream()
				.map(this::convertNewsToDto)
				.collect(Collectors.toList());
	}

	@Override
	public NewsletterDTO saveNewsletter(NewsletterDTO N) {
		// TODO Auto-generated method stub
		return convertNewsToDto(newsletterRepository.save(convertDtoToNews(N)));
	}

	@Override
	public NewsletterDTO updateNewsletter(NewsletterDTO N) {
		// TODO Auto-generated method stub
		return convertNewsToDto(newsletterRepository.save(convertDtoToNews(N)));
	}

	@Override
	public void deleteNewsletterById(Long id) {
		// TODO Auto-generated method stub
		newsletterRepository.deleteById(id);
	}

	@Override
	public void deleteNewsletter(Newsletter N) {
		// TODO Auto-generated method stub
		newsletterRepository.delete(N);
	}
	@Override
	public NewsletterDTO convertNewsToDto(Newsletter N) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	NewsletterDTO clubSportDTO = modelMapper.map(N, NewsletterDTO.class);
	 return clubSportDTO ;
	}
	@Override
	public Newsletter convertDtoToNews(NewsletterDTO NDto) {
		Newsletter produit = new Newsletter();
	produit = modelMapper.map(NDto, Newsletter.class);
	return produit ;

}}
