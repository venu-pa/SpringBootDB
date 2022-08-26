package com.example.DBOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DBOperations.entiry.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	

}
