package com.example.demo;

import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import com.example.demo.repository.LocauRepository;
import com.example.demo.repository.SalleRepository;
import com.example.demo.repository.ClubSportRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Locau;
import com.example.demo.entity.Salle;
import com.example.demo.entity.ClubSport;
import com.example.demo.restcontrollers.localrestcontrollers;

@RestController
@SpringBootTest
class M2LEventApplicationTests {
	@Autowired
	private LocauRepository locauRepository;
	
	@Autowired
	private ClubSportRepository clubSportRepository;
	@Autowired
	private SalleRepository salleRepository;

	
	
	@Test
	public void testCreationsLocal() {
		Locau local = new Locau(204, true);
		locauRepository.save(local);

	}
	
	@Test
	public void testFindByNumLocau() {
		List<Locau> l =  locauRepository.findByNumLocau(204);
				
		 System.out.println(l);
	}
	

	/*@Test
	public void testFindLocal() {
		
		Locau local = LocauRepository.findById(1L).get();
		System.out.println(local);
	}
	
	@Test
	public void testUpdateLocal() {
		Locau local = LocauRepository.findById(1L).get();
		local.setLibre(false);
		local.setNumBureau(12);
		LocauRepository.save(local);
	}
	
	@Test
	public void testDeleteLocal() {
		LocauRepository.deleteById(5L);
	}
	
	@Test
	public void testListLocau() {
		List<Locau> locau = LocauRepository.findAll();
		for (Locau l : locau) {
			System.out.println(l);
		}
	}
	*//*@Test
	public void testCreationClubSport() {
		Locau local = LocauRepository.findById(1L).get();
		ClubSport cs = new ClubSport("Les Petits Footeurs",0,"test","test", "test", "test", "test", local);
		 clubSportRepository.save(cs);
	}/*
	}  */
	
	@Test
	public void testFindByNomClubSport() {
		
		
	    List<ClubSport> club = clubSportRepository.findByNomClubSport("Les Petits Footeurs");
	    
	 
	        System.out.println(club);
	  
	}


}
