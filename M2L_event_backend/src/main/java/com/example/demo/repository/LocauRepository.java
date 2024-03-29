package com.example.demo.repository;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Locau;


@Repository
@RepositoryRestResource(path = "rest")
public interface LocauRepository extends JpaRepository<Locau, Long> {
	
	@Query(value = "INSERT INTO `locau`( `libre`, `num_bureau`) VALUES ('?','?')", nativeQuery = true)
	public Locau saveLocau(Locau local);
	
	@Query(value = "UPDATE `locau` SET `libre`='?',`num_bureau`='?' WHERE `id` = ?", nativeQuery = true)
	public Locau updateLocau(Locau local);
	
	@Query(value = "SELECT * FROM locau WHERE id = ?", nativeQuery = true )
	public Locau findLocauById(Long id);
	
	@Query(value = "SELECT * FROM locau", nativeQuery = true)
	public List<Locau> findLocauAll();
	
	@Query(value = "DELETE FROM `locau` WHERE id = ?", nativeQuery = true)
	public void deleteByIdLocau(Long id);
	
	@Query( value = "SELECT * FROM locau  WHERE locau.num_bureau LIKE ?  " , nativeQuery = true)
	public List<Locau> findByNumBureau( int num_bureau );

}

