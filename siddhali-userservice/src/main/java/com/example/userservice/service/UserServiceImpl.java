package com.example.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dao.UserDao;
import com.example.userservice.model.Customer_master;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;
	
	@Override
	public Customer_master addCustomer(Customer_master customer) {
		// TODO Auto-generated method stub
		return userDao.save(customer);
	}

	@Override
	public String deleteCustomer(String custid) {
		// TODO Auto-generated method stub
	   userDao.deleteById(custid);
		return "Customer deleted";
	}

}
