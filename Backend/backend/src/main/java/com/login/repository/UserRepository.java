package com.login.repository;


import com.login.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {


    User findByEmail(String email);



}