package com.example.demo;

import java.util.List;




import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import com.example.demo.repository.LocauRepository;
import com.example.demo.repository.SalleRepository;
import com.example.demo.repository.ClubSportRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Locau;
import com.example.demo.entity.Salle;
import com.example.demo.dto.LocauDto;
import com.example.demo.entity.ClubSport;
import com.example.demo.restcontrollers.Localrestcontrollers;
import com.example.demo.service.ClubSportServiceImplement;
import com.example.demo.service.CompetitionServiceImplement;
import com.example.demo.service.LocauServiceImplement;
import com.example.demo.service.NewsletterServiceImplement;
import com.example.demo.service.SalleServiceImplement;
import com.example.demo.service.UserServiceImplement;
import com.mysql.cj.util.LazyString;

@RestController
@SpringBootTest
class M2LEventApplicationTests {
	@Autowired
	private LocauServiceImplement locauServiceImplt;
	
	@Autowired
	private ClubSportServiceImplement clubSportimplement ;
	
	@Autowired
	private SalleServiceImplement salleImplt;
	
	@Autowired
	private CompetitionServiceImplement comptetionImplt;
	
	@Autowired
	private NewsletterServiceImplement newsletterImplt;
	
	@Autowired
	private UserServiceImplement userImplt;

	
	/* Test local*/
	/*@Test
	public void testCreationsLocal() {
		Locau local = new Locau(208, true);
		convertLocauToDto(locauServiceImplt.saveLocau(convertDtoToLocau(local)));
	}
	@Test
	public void testFindByNumLocau() {
		List<LocauDto> l =  locauServiceImplt.findByNumBureau(204);
	   l.stream().forEach(System.out::println);	 
	}
	@Test
	public void testFindLocalById() {
		
		LocauDto local = locauServiceImplt.findLocauById(1L);
		System.out.println(local);
	}
	/*@Test
	public void testUpdateLocal() {
		Locau local = locauServiceImplt.findLocauById(16L);
		local.setLibre(false);
		local.setNumBureau(202);
		locauServiceImplt.updateLocau(local);
	}
	@Test
	public void testDeleteLocal() {
		locauServiceImplt.deleteByIdLocau(15L);
	}*/
	@Test
	public void testFindAllLocau() {
		List<LocauDto> locau = locauServiceImplt.findLocauAll();
		for (LocauDto l : locau) {
			Locau lo =locauServiceImplt.convertDtoToLocau(l);
			System.out.println((lo));
		}
	}/*
	/*Test ClubSport*//*
	@Test
	public void testCreationClubSport() {
		LocauDto local = locauServiceImplt.findLocauById(12L);
		ClubSport cs = new ClubSport("Les Petits Footeurs",0,"test","test", "test", "test", "test", local);
		 clubSportimplement.saveClubSport(cs);
	}
	@Test
	public void testFindAllClubSport() {
	    List<ClubSport> club = clubSportimplement.findAllClubSport();
	    for(ClubSport cs : club) {
	        System.out.println(cs);
	    }
	}
	@Test
	public void testFindClubSportById() {
		ClubSport club = clubSportimplement.findClubSportById(24L);
		System.out.println(club);
	}
	@Test
	public void testUpdateClubSport() {
		Locau local = locauServiceImplt.findLocauById(16L);
		ClubSport club = clubSportimplement.findClubSportById(24L);
		club.setAdresse("a");
		club.setMail("m");
		club.setNom("les poings d'acier");
		club.setRegion("r");
		club.setSiret("s");
		club.setTel(0612343562);
		club.setVille("v");
		club.setLocau(local);
		clubSportimplement.updateClubSport(club);
	}
	@Test
	public void testDeleteClubSportById() {
	clubSportimplement.deleteClubSportById(13L);
	}*/

}
