package com.example.wenspringmvchibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerDAOImpl implements CustomerDao {
	//auto wire with bean session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.getCurrentSession();		
		List<Customer> customers = session.createQuery("FROM Customer", Customer.class).getResultList();
		return customers;
	}

}
