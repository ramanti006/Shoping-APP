package com.example.registration.Shoping_Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Shoping_Registration.Model.UserModel;
import com.example.registration.Shoping_Registration.Service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;

	
	@PostMapping("/entry")
	private String registerUser(@RequestBody UserModel user)
	{
		return service.saveUser(user);
	}
    
	@GetMapping("/finduser/{emailId}/{AcknowlegmentNumber}")
	private UserModel findUser(@PathVariable String emailId,@PathVariable String AcknowlegmentNumber)
	{
		return service.showUser(emailId, AcknowlegmentNumber);
	}
	
}
