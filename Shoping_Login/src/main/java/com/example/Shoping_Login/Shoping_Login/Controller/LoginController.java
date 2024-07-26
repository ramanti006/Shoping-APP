package com.example.Shoping_Login.Shoping_Login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoping_Login.Shoping_Login.Model.LoginUser;
import com.example.Shoping_Login.Shoping_Login.Service.LoginRepositoryService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginRepositoryService ser;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginUser user)
	{
		return ser.checkUser(user);
	}

}
