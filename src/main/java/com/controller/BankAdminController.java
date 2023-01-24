package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;
import com.service.BankAdminService;

@RestController
@RequestMapping(value = "BankAdmin")
public class BankAdminController {
	
	@Autowired
	private BankAdminService bankAdminService;
	
	@PostMapping(value = "addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
		return new ResponseEntity<Customer>(bankAdminService.addCustomer(customer), HttpStatus.CREATED);
	}
	
	@GetMapping(value="getCustomer/{custId}")
	public Customer getCustomerById(@PathVariable int custId) {
		return bankAdminService.getCustomerById(custId);
	}

}
