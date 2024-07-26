package com.example.registration.Shoping_Registration.Service;

import org.springframework.stereotype.Service;

import com.example.registration.Shoping_Registration.Model.UserModel;


public abstract class UserService {

	
	public abstract String saveUser(UserModel us);
	public abstract UserModel showUser(String emailId ,String AcknowlegmentNumber);
	
}
