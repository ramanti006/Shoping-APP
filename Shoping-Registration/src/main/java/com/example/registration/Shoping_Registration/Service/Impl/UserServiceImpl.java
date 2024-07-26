package com.example.registration.Shoping_Registration.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.registration.Shoping_Registration.Model.UserModel;
import com.example.registration.Shoping_Registration.Repsitery.UserRepositery;
import com.example.registration.Shoping_Registration.Service.UserService;

@Service
public class UserServiceImpl extends UserService {
	
	@Autowired
	private UserRepositery repo;
	
	public  String saveUser(UserModel us)
	{
		System.out.println(us);
		
		Optional<UserModel> optionalUser = Optional.ofNullable(repo.findByemailId(us.getEmailId()));
		UserModel check = optionalUser.orElse(null);
		System.out.println(check);
		
		if(check == null)
		{
		if(us.getPassword().equals(us.getRetypePassword()))
		{
			System.out.println("everything is fine");
			String num = createAckNumber();
			us.setAcknowlegmentNumber(num);
			repo.save(us);
			return num;
		}
		
		else
		{
			
			String msg = "Password mismatched!!!";
			System.out.println(msg);
			return msg;
		}
		}
		else
		{
			
			String msg = "User is already registered";
			System.out.println(msg);
			return msg;
		}
	}
   
	
	public String createAckNumber()
	{
		 int randomNumber = (int) (Math.random() * 100) + 1;
		 return String.valueOf(randomNumber);
	}
	
	public UserModel showUser(String emailId ,String AcknowlegmentNumber)
	{
		Optional<UserModel> optionalUser = Optional.ofNullable(repo.findByemailAndAckno(emailId,AcknowlegmentNumber));
		UserModel check = optionalUser.orElse(null);
		
		return check;
	}
}
