package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.NewsletterDTO;
import com.example.demo.entity.Newsletter;
import com.example.demo.service.NewsletterServiceImplement;

@RestController
@RequestMapping("/api/newsletter")
@CrossOrigin
public class NewsletterRestControllers {
	@Autowired
	NewsletterServiceImplement newsletterService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public List<NewsletterDTO> getAllNewsletter(){
		return newsletterService.findAllNewsletter();
	}
	
	@RequestMapping(value="getBy/{id}",method = RequestMethod.GET)
	public NewsletterDTO getNewsletterById(@PathVariable("id") Long id) {
	return newsletterService.findNewsletterById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public NewsletterDTO createNewsletter(@RequestBody NewsletterDTO newsletter) {
	return newsletterService.saveNewsletter(newsletter);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public NewsletterDTO updateNewsletter(@RequestBody NewsletterDTO newsletter) {
	return newsletterService.updateNewsletter(newsletter);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteNewsletter(@PathVariable("id") Long id){
		newsletterService.deleteNewsletterById(id);
	}
}
