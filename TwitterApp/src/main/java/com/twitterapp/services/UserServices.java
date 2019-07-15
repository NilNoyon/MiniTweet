package com.twitterapp.services;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.twitterapp.model.User;
import com.twitterapp.repository.UserRepository;

@Service
@Transactional
@Component

public class UserServices {

	private final UserRepository userRepository;
	
	public UserServices(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Bean
	public void saveUser(User user) {
		
		userRepository.save(user);
	}
}
