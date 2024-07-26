package com.example.Shoping_Login.Shoping_Login.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class UserModel {
	
	
	private int id;
	private String name;
	private String Country;
	private String phoneNo;
	private String emailId;
	private String password;
	private String retypePassword;
	private String AcknowlegmentNumber;
	
	
	public UserModel(int id, String name, String country, String phoneNo, String emailId, String password,String AcknowlegmentNumber,
			String retypePassword) {
		super();
		this.id = id;
		this.name = name;
		Country = country;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.password = password;
		this.retypePassword = retypePassword;
		AcknowlegmentNumber = AcknowlegmentNumber;
	}
	
	
	public UserModel() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRetypePassword() {
		return retypePassword;
	}
	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}
	public String getAcknowlegmentNumber() {
		return AcknowlegmentNumber;
	}
	public void setAcknowlegmentNumber(String acknowlegmentNumber) {
		AcknowlegmentNumber = acknowlegmentNumber;
	}


	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", Country=" + Country + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + ", password=" + password + ", retypePassword=" + retypePassword + ", AcknowlegmentNumber="
				+ AcknowlegmentNumber + "]";
	}


	
	

}
