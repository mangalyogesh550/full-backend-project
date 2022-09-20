package com.backend.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.project.payloads.UserDto;

@Service
public interface UserService {

	UserDto addUser(UserDto userDto);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	UserDto updateUser(UserDto userDto, Integer userId);

	void deleteUser(Integer userId);

}
