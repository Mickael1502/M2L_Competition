package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImplement;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserRestControllers {
	@Autowired
	UserServiceImplement userService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public List<UserDTO> getAllUser(){
		return userService.findAllUser();
	}
	
	@RequestMapping(value="getBy/{id}",method = RequestMethod.GET)
	public UserDTO getUserById(@PathVariable("id") Long id) {
	return userService.findUserById(id);
	 }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public UserDTO createUser(@RequestBody UserDTO user) {
	return userService.saveUser(user);
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public UserDTO updateSalle(@RequestBody UserDTO user) {
	return userService.updateUser(user);
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id){
		userService.deleteUserById(id);
	}
}


