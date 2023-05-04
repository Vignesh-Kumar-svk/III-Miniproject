package com.example.homeservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.homeservices.repository.CustomerRepository;

@Controller
public class DashboardController {

	@Autowired
	private CustomerRepository customerrepo;
	
	@GetMapping("/registrations-list")
	public ModelAndView getAllusers() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("customer",customerrepo.findAll());
		mv.setViewName("registrationdashboard");
		return mv;
	}
	
	@GetMapping("/containerandservices-bookings-list")
	public ModelAndView getAllbookingdetails() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("bookings", customerrepo.findAll());
		mav.setViewName("csbdashboard");
		return mav;
		
	}
}
