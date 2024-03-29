package com.example.demo.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ClubSport;


@Repository
public interface ClubSportRepository extends JpaRepository<ClubSport, Long> {
	
	
	@Query( value = "INSERT INTO `club_sport`( `adresse`, `mail`, `nom`, `region`, `siret`, `tel`, `ville`, `locau_id`)"
			+ " VALUES ('?','?','?','?','?','?','?','?')", nativeQuery = true)
	public ClubSport saveClubSport(ClubSport cs);
	
	@Query(value = "SELECT * FROM club_sport", nativeQuery = true)
	public List<ClubSport> findAllClubSport();
	
	@Query(value = "SELECT * FROM club_sport WHERE id = ?", nativeQuery = true)
	public ClubSport findClubSportById(Long id);
	
	@Query(value = "UPDATE club_sport SET `adresse`='?',`mail`='?',`nom`='?',`region`='?',`siret`='?',`tel`='?',`ville`='?',`locau_id`='?' WHERE id = ?", nativeQuery =true)
	public ClubSport updateClubSport(ClubSport club);
	
	@Query(value = "DELETE FROM club_sport WHERE id = ?", nativeQuery = true)
	public void deleteClubSportById(Long id);


	public List<ClubSport> findClubSportBySportId(Long id);
	
	
	
}
