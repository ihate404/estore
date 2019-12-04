package com.briup.dao;

import com.briup.bean.Customer;

public interface CustomerMapper {
	public Customer selectCustomerByName(String name);
	public void insertCustomer(Customer customer);
}
