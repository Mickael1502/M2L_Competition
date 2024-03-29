package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.NewsletterDTO;
import com.example.demo.entity.Newsletter;

public interface NewsletterService {

	NewsletterDTO findNewsletterById(Long id);
	List<NewsletterDTO> findAllNewsletter();
	NewsletterDTO saveNewsletter(NewsletterDTO entity);
	NewsletterDTO updateNewsletter (NewsletterDTO entity);
	void deleteNewsletterById(Long id);
	void deleteNewsletter(Newsletter id);
	NewsletterDTO convertNewsToDto(Newsletter N);
	Newsletter convertDtoToNews(NewsletterDTO NDto);
}
