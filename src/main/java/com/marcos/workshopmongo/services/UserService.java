package com.marcos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.workshopmongo.entities.User;
import com.marcos.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
//	public User findById(String id) {
//		Optional<User> obj = repository.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
//	}
}
