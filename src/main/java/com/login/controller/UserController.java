package com.login.controller;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.login.entity.User;
import com.login.repository.UserRepo;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("save")
	public String saveEmployee(@RequestBody User user){
		userRepo.save(user);
		
		return "saved";
	}
	
	@GetMapping("all")
	public List<User> getAllUser(){
		return userRepo.findAll();
	}

	@DeleteMapping("delete")
	public String deleteAllUser() {
		 userRepo.deleteAll();
		 return "Delete successfully";
		
		
	}
}
