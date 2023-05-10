package com.example.homeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homeservices.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup,Long > {

}
