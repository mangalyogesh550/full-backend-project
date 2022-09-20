package com.backend.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.project.payloads.ApiResponse;
import com.backend.project.payloads.UserDto;
import com.backend.project.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	// POST-add a new User
	@PostMapping("/user")
	public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userDto) {
		UserDto addedUserDto = this.userService.addUser(userDto);
		return new ResponseEntity<>(addedUserDto, HttpStatus.CREATED);

	}

	// GET-get a user
	@GetMapping("/user/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer id) {
		return ResponseEntity.ok(this.userService.getUserById(id));

	}

	// GET-get all users
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		return ResponseEntity.ok(this.userService.getAllUsers());
	}

	// Put-update an existing user
	@PutMapping("/user/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer id) {
		UserDto updatedUser = this.userService.updateUser(userDto, id);
		return ResponseEntity.ok(updatedUser);
	}

	// DELETE-delete an existing user
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer id) {
		this.userService.deleteUser(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted successfully", true), HttpStatus.OK);

	}
}
