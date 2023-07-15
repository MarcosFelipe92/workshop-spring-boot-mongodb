package com.marcos.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.workshopmongo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping()
	public ResponseEntity<List<User>> findAll() {
		List<User> list = new ArrayList<>();
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		list.add(alex);
		list.add(maria);
		return ResponseEntity.ok().body(list);
	}
}
