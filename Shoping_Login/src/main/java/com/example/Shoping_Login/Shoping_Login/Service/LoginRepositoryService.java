package com.example.Shoping_Login.Shoping_Login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.Shoping_Login.Shoping_Login.Model.LoginUser;
import com.example.Shoping_Login.Shoping_Login.Model.UserModel;
import com.example.Shoping_Login.Shoping_Login.Repository.LoginRepository;

import java.time.LocalDateTime;

@Service
public class LoginRepositoryService {
	
	@Autowired
	private LoginRepository repo;
	
	 private WebClient webclient;
	 
	 @Autowired
	    public void OrderService(WebClient.Builder webClientBuilder) {
	        this.webclient = webClientBuilder.build();
	    }
	
	public String checkUser( @RequestBody LoginUser us)
	{
		
		if(us.getAcknowledgeNumber() == null || us.getEmail() == null || us.getUserName() == null)
		{
			   String msg = "value is null";
	            System.out.println(msg);
	            return msg;
		}
		System.out.println(us);
		String baseUrl = "http://localhost:8081/finduser";

        // Construct the URL with proper encoding
        String registrationURL = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment("{emailId}", "{acknowledgmentNumber}")
                .buildAndExpand(us.getEmail(), us.getAcknowledgeNumber())
                .toUriString();
		
		try {
            UserModel value = webclient
                    .get()
                    .uri(registrationURL, us.getEmail(), us.getAcknowledgeNumber())
                    .retrieve()
                    .bodyToMono(UserModel.class)
                    .block();

            if (value == null) {
                String msg = "User does not exist. Please register.";
                System.out.println(msg);
                return msg;
            } else {
                us.setLoginTime(LocalDateTime.now());
                System.out.println(value);
                repo.save(us);
                String msg = "Login successful";
                System.out.println(msg);
                return msg;
            }
   
        } catch (Exception e) {
            String msg = "An error occurred: " + e.getMessage();
            System.out.println(msg);
            return msg;
        }

    }
	
	
	

}
