package com.naumansoftwares.freshvotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naumansoftwares.freshvotes.domain.User;
import com.naumansoftwares.freshvotes.userservice.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<User> create(@RequestBody User user){
		
		return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getById(@PathVariable Long id){
		
		return new ResponseEntity<User>(userService.getById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		return new ResponseEntity<List<User>>(userService.getAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

}
