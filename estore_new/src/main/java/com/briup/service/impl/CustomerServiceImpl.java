package com.briup.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Customer;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.common.ServiceException;
import com.briup.dao.CustomerMapper;
import com.briup.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService{

	public void register(Customer customer)throws ServiceException {
		//根据用户名去查询数据库
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		Customer cus = mapper.selectCustomerByName(customer.getName());
		if(cus==null) {
			mapper.insertCustomer(customer);
			session.commit();
		}else {
			throw new ServiceException("该用户已经存在，请重新注册");
		}
	}
	public Customer login(String name,String password)throws ServiceException {
		//用户名是否正确
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		Customer customer = mapper.selectCustomerByName(name);
		if(customer!=null) {
			if(customer.getPassword().equals(password)) {
				return customer;
			}else {
				throw new ServiceException("密码错误，请重新填写");
			}
		}else {
			throw new ServiceException("用户名错误，请重新填写");
		}
	}

}
