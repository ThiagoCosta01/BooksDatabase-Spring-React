package br.com.books.database.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.books.database.domain.user.UserDto;
import br.com.books.database.domain.user.UserModel;
import br.com.books.database.domain.user.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api")
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<UserModel>> getAllUsers() {
		System.out.println(ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll()));
		return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity createNewUser(@RequestBody @Valid UserDto userDto) {
		
		UserModel userModel = new UserModel(userDto);
		userRepository.save(userModel);
		
		return ResponseEntity.ok().build();
	}
	
}
