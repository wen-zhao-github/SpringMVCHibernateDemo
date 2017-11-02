package com.example.wenspringmvchibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wenspringmvchibernate.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model model){
		
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customer_list",customers);		
		return "custom-list";
	}
	@RequestMapping("/showFormForAdd")
    public String addCustomer(Model model){
		Customer customer = new Customer();
		model.addAttribute("new_customer", customer);		
		return "add-customer-form";
	}
	@RequestMapping("/processAddForm")
	public String processAddCustomer(@ModelAttribute("new_customer") Customer customer){
		customerService.addCustomer(customer);
		return "redirect:/customer/list";		
	}
	@RequestMapping("/updateForm")
	public String updateForm(@RequestParam("customerId") int customerid, Model model){
		Customer customer = customerService.getCustomer(customerid);
		model.addAttribute("currentCustomer", customer);
		return "update-form";
	}
	@RequestMapping("/saveUpdates")
	public String saveUpdates(@ModelAttribute("currentCustomer") Customer customer){
		customerService.addCustomer(customer);
		return "redirect:/customer/list";
	}
	@RequestMapping("/deleteForm")
	public String delete(@RequestParam("customerId") int customerid, Model model){
		customerService.deleteCustomer(customerid);
		return "redirect:/customer/list";
	}
}
