package com.marcos.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcos.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
