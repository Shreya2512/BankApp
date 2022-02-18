package com.bank.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Address {

	@NotNull
	@NotBlank
	@Pattern(regexp="^[a-zA-z][0-9]{0,50}$")
	private String house;

	@NotNull
	@NotBlank
	
	@Pattern(regexp="^[a-zA-z]{0,25}$")
	private String city;

	@NotNull
	@NotBlank
	
	@Pattern(regexp="^[a-zA-z]{0,25}$")
	private String state;

	@NotNull
	@NotBlank
	
	@Pattern(regexp="^[0-9]{0,7}$")
	private int pin;

	
	@Pattern(regexp = "^[0-9]{0-15}$")
	private String telephone_no;

	
	@Pattern(regexp = "^[0-9]{0-15}$")
	private String fax;

	public Address(String house, String city, String state, int pin, String telephone_no, String fax) {
		super();
		this.house = house;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.telephone_no = telephone_no;
		this.fax = fax;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getTelephone_no() {
		return telephone_no;
	}

	public void setTelephone_no(String telephone_no) {
		this.telephone_no = telephone_no;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "Address [house=" + house + ", city=" + city + ", state=" + state + ", pin=" + pin + ", telephone_no="
				+ telephone_no + ", fax=" + fax + "]";
	}

}
