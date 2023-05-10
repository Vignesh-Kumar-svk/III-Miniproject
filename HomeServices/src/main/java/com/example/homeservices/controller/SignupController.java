package com.example.homeservices.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.homeservices.model.Customer;
import com.example.homeservices.model.Signup;
import com.example.homeservices.repository.*;

@Controller
public class SignupController {
	
	
	private SignupRepository signuprepo;

	public SignupController(SignupRepository signuprepo) {
		super();
		this.signuprepo = signuprepo;
	}
	
	@GetMapping("/Signup")
	public String showlogin(Model model)
	{
		model.addAttribute("signup",new Signup());
		return "signup";
	}
	
	@PostMapping("/Signup")
	public ModelAndView userSignup(Signup signup) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("signup", signuprepo.save(signup));
		return mv;
		
		
	}

}
