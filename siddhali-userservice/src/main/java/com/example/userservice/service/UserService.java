package com.example.userservice.service;

import com.example.userservice.model.Customer_master;

public interface UserService {
	
	public Customer_master addCustomer(Customer_master customer);
	 public String deleteCustomer(String custid);
	 

}
