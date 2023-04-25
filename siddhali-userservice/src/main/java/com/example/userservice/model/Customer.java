package com.example.userservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_master")
public class Customer {
	
	@Id
	String customer_master;
	String firstname;
	String middlename ;
	String lastname;
	String customerCity;
	String customerContact;
	String occupation;
	Date customerDob;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customer_master, String firstname, String middlename, String lastname, String customerCity,
			String customerContact, String occupation, Date customerDob) {
		super();
		this.customer_master = customer_master;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customerCity = customerCity;
		this.customerContact = customerContact;
		this.occupation = occupation;
		this.customerDob = customerDob;
	}
	public String getCustomer_master() {
		return customer_master;
	}
	public void setCustomer_master(String customer_master) {
		this.customer_master = customer_master;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
	@Override
	public String toString() {
		return "Customer [customer_master=" + customer_master + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", customerCity=" + customerCity + ", customerContact="
				+ customerContact + ", occupation=" + occupation + ", customerDob=" + customerDob + "]";
	}
	
	

}
