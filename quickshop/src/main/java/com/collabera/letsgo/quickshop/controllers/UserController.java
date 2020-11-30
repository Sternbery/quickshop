package com.collabera.letsgo.quickshop.controllers;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.letsgo.quickshop.model.User;
import com.collabera.letsgo.quickshop.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/{id}")
	public Optional<User> getUserByID(@PathVariable int id) throws SQLException {
		return userRepo.getByID(id);
	}
}
