package com.example.homeservices.service;

import org.springframework.stereotype.Service;

import com.example.homeservices.model.Customer;
import com.example.homeservices.repository.CustomerRepository;

@Service
public class CustomerService {
	
	CustomerRepository customerrepo;
	public Customer login(String email,String password) {
		Customer data=customerrepo.findByEmailAndPassword(email,password);
		return data;
		
	}

}
