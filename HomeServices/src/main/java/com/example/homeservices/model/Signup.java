package com.example.homeservices.model;

import jakarta.persistence.*;


@Entity
public class Signup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String email;
	private String password;
	private String confirmpassword;
	public Signup(Long id, String email, String password, String confirmpassword) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public Signup() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	

}
