package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public UserDTO findUserById(Long id) {
		// TODO Auto-generated method stub
		return convertUserToDto(userRepository.findById(id).get());
	}

	@Override
	public List<UserDTO> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll().stream()
				.map(this::convertUserToDto)
				.collect(Collectors.toList());
	}

	@Override
	public UserDTO saveUser(UserDTO U) {
		// TODO Auto-generated method stub
		return convertUserToDto(userRepository.save(convertDtoToUser(U)));
	}

	@Override
	public UserDTO updateUser(UserDTO U) {
		// TODO Auto-generated method stub
		return convertUserToDto(userRepository.save(convertDtoToUser(U)));
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public void deleteUser(User U) {
		// TODO Auto-generated method stub
		userRepository.delete(U);
	}
	@Override
	public UserDTO convertUserToDto(User U) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	UserDTO clubSportDTO = modelMapper.map(U, UserDTO.class);
	 return clubSportDTO ;
	}
	@Override
	public User convertDtoToUser(UserDTO UDto) {
		User produit = new User();
	produit = modelMapper.map(UDto, User.class);
	return produit ;

}

}
