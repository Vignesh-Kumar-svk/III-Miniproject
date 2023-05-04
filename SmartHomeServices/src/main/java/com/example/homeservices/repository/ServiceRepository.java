package com.example.homeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homeservices.model.HomeServices;

public interface ServiceRepository extends JpaRepository<HomeServices,Long>{

}
