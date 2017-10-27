package com.example.wenspringmvchibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerServlet {
	@RequestMapping("/listCustomer")
	public String listCustomer() throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/customer_info?useSSL=false";
		String username= "webcustomer";
		String pwd="webcustomer";
		System.out.println("test jdbc link..");
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, pwd); 		
        System.out.println("connection granted");
		return "custom-list";
	}
	

}
