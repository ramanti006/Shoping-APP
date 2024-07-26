package com.example.Shoping_Login.Shoping_Login.Model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="login")
public class LoginUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginid;
    private String UserName;
    private String AcknowledgeNumber;
    private String email;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "login_time")
    private LocalDateTime loginTime;
    
    

	public LoginUser() {
		super();
	}

	public LoginUser(int loginid, String userName, String acknowledgeNumber, String email, LocalDateTime loginTime) {
		super();
		this.loginid = loginid;
		UserName = userName;
		AcknowledgeNumber = acknowledgeNumber;
		this.email = email;
		this.loginTime = loginTime;
	}

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getAcknowledgeNumber() {
		return AcknowledgeNumber;
	}

	public void setAcknowledgeNumber(String acknowledgeNumber) {
		AcknowledgeNumber = acknowledgeNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(LocalDateTime localDateTime) {
		this.loginTime = localDateTime;
	}

	@Override
	public String toString() {
		return "LoginUser [loginid=" + loginid + ", UserName=" + UserName + ", AcknowledgeNumber=" + AcknowledgeNumber
				+ ", email=" + email + ", loginTime=" + loginTime + "]";
	}
    
    
    
}
