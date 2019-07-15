package com.twitterapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.twitterapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
