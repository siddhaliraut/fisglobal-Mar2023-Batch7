package com.example.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userservice.model.Customer;

public interface UserDao extends JpaRepository<Customer, String> {

}
