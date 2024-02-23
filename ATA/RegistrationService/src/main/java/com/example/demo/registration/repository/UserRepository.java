package com.example.demo.registration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.registration.model.UserRegistration;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration,Integer>{

	Optional<UserRegistration> findByName(String name);

	

	



}
