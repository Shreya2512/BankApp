package com.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.entity.AccountDetails;
import com.bank.entity.Customer;


@RestController
public class BankController {

	List<Customer> customers = new ArrayList<>();
	List<Account> accounts = new ArrayList<>();
	AccountDetails accDetails;
	Account acc;
	

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {

			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}

	@PostMapping("/addCustomers")
	public String addCustomer(@RequestBody @Valid Customer customer) {

		customers.add(customer);
		return "added";
	}
	
	@PostMapping("/addAccount")
	public String addAccount(@RequestBody @Valid Account account) {

		accounts.add(account);
		return "added";
	}
	
	@GetMapping("/deposit/{accountNo}/{amount}")
	public String deposit(@PathVariable("accountNo")String accountNo,@PathVariable("amount")String amount)
	{
		String accNo = accDetails.getAccountNo();
		String bal = acc.getInit_deposit()+amount;
		System.out.println(bal);
		
		return bal;
	}

}
