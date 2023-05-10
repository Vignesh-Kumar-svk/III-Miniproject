package com.example.homeservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.homeservices.model.Customer;
import com.example.homeservices.model.Signup;
import com.example.homeservices.repository.CustomerRepository;
import com.example.homeservices.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	private CustomerRepository customerrepo;
	
	public CustomerController(CustomerService customerservice, CustomerRepository customerrepo) {
		super();
		this.customerservice = customerservice;
		this.customerrepo = customerrepo;
	}

	@GetMapping("/Customer-Login")
	public String showlogin(Model model)
	{
		model.addAttribute("login",new Customer());
		return "login";
	}
	
	@PostMapping("/Customer-Login")
	public String userLogin(Customer customer) {
		Customer customerdata=customerservice.login(customer.getEmail(),customer.getPassword());
		System.out.println(customerdata);
		if(customerdata!=null) {
			return "redirect:/registrations-list";
		}
		else {
			return "error";
		}
	}
	
	@GetMapping("/customerregistration")
	public String showCustomerreg(Model model)
	{
		model.addAttribute("customerreg",new Customer());
		return "customerregistration";
	}
	
	@PostMapping("/customerregistration")
	public ModelAndView userSignup(Customer customer) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("signup", customerrepo.save(customer));
		mv.setViewName("successfullybooked");
		return mv;
	}
	
	@GetMapping("/customer-registrations-list")
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
