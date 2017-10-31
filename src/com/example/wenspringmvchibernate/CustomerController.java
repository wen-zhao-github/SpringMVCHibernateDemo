package com.example.wenspringmvchibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDao customerDAOImp;
	
	@RequestMapping("/list")
	public String listCustomer(Model model){
		
		List<Customer> customers = customerDAOImp.getCustomerList();
		model.addAttribute("customer_list",customers);		
		return "custom-list";
	}

}
