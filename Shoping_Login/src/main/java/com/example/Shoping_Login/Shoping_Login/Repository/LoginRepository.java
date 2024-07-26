package com.example.Shoping_Login.Shoping_Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Shoping_Login.Shoping_Login.Model.LoginUser;

@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Integer> {

}
