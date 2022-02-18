package com.bank.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Account {

	@NotEmpty
	//@Pattern(regexp="^[0-9]*$")
	@Pattern(regexp="^[0-9]{0,10}$")
	private String customer_id;
	private String account_type;
	
	@NotEmpty
	@Pattern(regexp="^[0-9]*$")
	@Min(value=500)
	
	private String init_deposit;
	
	

	public Account(String customer_id, String account_type, String init_deposit) {
		super();
		this.customer_id = customer_id;
		this.account_type = account_type;
		this.init_deposit = init_deposit;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getInit_deposit() {
		return init_deposit;
	}

	public void setInit_deposit(String init_deposit) {
		this.init_deposit = init_deposit;
	}

	@Override
	public String toString() {
		return "Account [customer_id=" + customer_id + ", account_type=" + account_type + ", init_deposit="
				+ init_deposit + "]";
	}

}
