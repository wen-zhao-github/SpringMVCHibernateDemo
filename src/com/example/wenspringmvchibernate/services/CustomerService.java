package com.example.wenspringmvchibernate.services;

import java.util.List;

import com.example.wenspringmvchibernate.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void addCustomer(Customer customer);

}
