package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="INSERT INTO `user`( `adresse`, `email`, `mdp`, `nom`, `region`, `rue`, `ville`, `club_id`) VALUES ('?','?','?','?','?','?','?','?')", nativeQuery = true)
	public User saveUser(User user);
	
	@Query(value="UPDATE `user` SET `adresse`='?',`email`='?',`mdp`='?',`nom`='?',`region`='?',`rue`='?',`ville`='?',`club_id`='?' WHERE id = ?", nativeQuery =true)
	public User updateUser(User user);
	
	@Query(value = "SELECT * FROM `user` WHERE id = ?", nativeQuery = true)
	public User findUserById(Long id);
	
	@Query(value="SELECT * FROM `user`", nativeQuery = true)
	public List<User> findAllUser();
	
	@Query(value = "DELETE FROM `user` WHERE id = ?", nativeQuery = true)
	public void deleteUserById(Long id);

}
