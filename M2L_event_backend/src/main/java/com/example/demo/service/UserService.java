package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

public interface UserService {

	UserDTO findUserById(Long id);
	List<UserDTO> findAllUser();
	UserDTO saveUser(UserDTO entity);
	UserDTO updateUser (UserDTO entity);
	void deleteUserById(Long id);
	void deleteUser(User id);
	User convertDtoToUser(UserDTO UDto);
	UserDTO convertUserToDto(User U);
}
