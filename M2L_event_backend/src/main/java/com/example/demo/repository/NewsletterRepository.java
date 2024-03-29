package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Newsletter;

@Repository
public interface NewsletterRepository extends JpaRepository<Newsletter, Long>{
	
	@Query(value="INSERT INTO `newsletter`( `date_fin`, `date_parution`, `club_sport_id`) VALUES ('?','?','?')", nativeQuery = true)
	public Newsletter saveNewsletter(Newsletter news);
	
	@Query(value="UPDATE `newsletter` SET `date_fin`='?',`date_parution`='?',`club_sport_id`='?' WHERE `id`='?'", nativeQuery =true)
	public Newsletter updateNewsletter(Newsletter news);
	
	@Query(value = "SELECT * FROM newsletter WHERE id = ?", nativeQuery = true)
	public Newsletter findNewsletterById(Long id);
	
	@Query(value="SELECT * FROM newsletter", nativeQuery = true)
	public List<Newsletter> findAllNewsletter();
	
	@Query(value = "DELETE FROM newsletter WHERE id = ?", nativeQuery = true)
	public void deleteNewsletterById(Long id);
}
