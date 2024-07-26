package com.example.registration.Shoping_Registration.Repsitery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.registration.Shoping_Registration.Model.UserModel;

@Repository
public interface UserRepositery extends JpaRepository<UserModel ,Integer> {
	
	UserModel findByemailId(String emailId);
	
	@Query("select s from UserModel s WHERE s.emailId=:e and s.AcknowlegmentNumber=:a")
	UserModel findByemailAndAckno(@Param("e") String emailId , @Param("a")String AcknowlegmentNumber);

}
