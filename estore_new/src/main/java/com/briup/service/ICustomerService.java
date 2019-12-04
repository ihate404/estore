package com.briup.service;

import javax.sql.rowset.serial.SerialException;

import com.briup.bean.Customer;
import com.briup.common.ServiceException;

public interface ICustomerService {
	void register(Customer customer)throws ServiceException;
	Customer login(String name,String password)throws ServiceException;
}
