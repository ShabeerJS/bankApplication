package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.CustomerRepo;

@Service
public class BankServiceImpl implements BankAdminService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {

		return customerRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(int custId) {
		   Customer customer=   customerRepo.findById(custId).get();
		return customer;
	}

}
