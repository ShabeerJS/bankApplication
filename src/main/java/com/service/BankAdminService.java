package com.service;

import com.entity.Customer;

public interface BankAdminService {
	
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer getCustomerById(int custId);

}
