package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Salle;

@Repository

public interface SalleRepository extends JpaRepository<Salle, Long> {
	@Query(value="INSERT INTO `salle`( `adresse`, `nom`, `ville`) VALUES ('?','?','?')", nativeQuery = true)
	public Salle saveSalle(Salle salle);
	
	@Query(value="UPDATE `salle` SET `adresse`='?',`nom`='?',`ville`='?' WHERE `id`='?'", nativeQuery =true)
	public Salle updateSalle(Salle salle);
	
	@Query(value = "SELECT * FROM `salle` WHERE id = ?", nativeQuery = true)
	public Salle findSalleById(Long id);
	
	@Query(value="SELECT * FROM `salle`", nativeQuery = true)
	public List<Salle> findAllSalle();
	
	@Query(value = "DELETE FROM `salle` WHERE id = ?", nativeQuery = true)
	public void deleteSalleById(Long id);

	

}
