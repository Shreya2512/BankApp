package com.bank.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer {
	
	@NotNull
	@NotBlank
	//@Pattern(regexp="^{0,25}")
	//@Pattern(regexp = "^[a-zA-Z\\s]*$")
	
	private String name;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "DD-MON-YYYY")
	private String dob;
	
	@NotNull
	private String gender;
	
	@NotBlank
	//@Pattern(regexp="^{0,30}$")
	//@Pattern(regexp = "^(.+)@(.+)$")
	private String email;
	private Address address;
	public Customer(String name, String dob, String gender, String email, Address address) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	

}
