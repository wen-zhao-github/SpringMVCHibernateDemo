package com.example.wenspringmvchibernate;

import java.util.List;

public interface CustomerDao {
	public List<Customer> getCustomerList();

	public void addCustomer(Customer customer);

	public Customer getCustomer(int customerid);

	public void deleteCustomer(int customerid);

}
