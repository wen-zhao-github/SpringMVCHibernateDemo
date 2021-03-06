package com.example.wenspringmvchibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.wenspringmvchibernate.Customer;
import com.example.wenspringmvchibernate.CustomerDao;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomerList();
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerid) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(customerid);
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerid) {
		customerDao.deleteCustomer(customerid);
		
	}

}
