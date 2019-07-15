package com.twitterapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twitterapp.model.User;

@Controller
@ComponentScan("com.twitterapp.services.UserServices")
public class RegisterController {
	@Autowired	
	
	@GetMapping("/register")
    public String register() {
		System.out.println("Hello From Controller");
        return "register";
    }
	
	
	@GetMapping("/save-user")
	public String saveRegisterUser(@RequestParam String firstname,@RequestParam String lastname, @RequestParam String email, @RequestParam String password, @RequestParam String type) {
		User user = new User(firstname,lastname,email,password,type);
		return "User Registered";
	}
}
