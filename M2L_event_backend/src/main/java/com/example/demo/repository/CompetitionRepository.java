package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Competition;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long>{
	
	@Query(value="INSERT INTO `competition`( `date_debut`, `date_fin`, `heure_debut`, `heure_fin`, `nbr_participant`, `club_sport_id`, `salle_id`)"
			+ " VALUES ('?','?','?','?','?','?','?')", nativeQuery = true)
	public Competition saveCompetition(Competition comp);
	
	@Query(value="UPDATE `competition` SET `date_debut`='?',`date_fin`='?',`heure_debut`='?',"
			+ "`heure_fin`='?',`nbr_participant`='?',`club_sport_id`='?',`salle_id`='?' WHERE id = '?'", nativeQuery =true)
	public Competition updateCompetition(Competition comp);
	
	@Query(value = "SELECT * FROM competition WHERE id = ?", nativeQuery = true)
	public Competition findCompetitionById(Long id);
	
	@Query(value="SELECT * FROM competition", nativeQuery = true)
	public List<Competition> findAllCompetition();
	
	@Query(value = "DELETE FROM competition WHERE id = ?", nativeQuery = true)
	public void deleteCompetitionById(Long id);
}
