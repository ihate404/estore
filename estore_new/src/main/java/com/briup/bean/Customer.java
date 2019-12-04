package com.briup.bean;

import java.io.Serializable;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 顾客类
 * */
public class Customer implements Serializable,HttpSessionBindingListener{
	private Long id;
	private String name;
	private String password;
	private String telephone;
	private String email;
	private String zipCode;
	private List<Address>addresses;
	public Customer(){}
	public Customer(Long id, String name, String password, String telephone,
			String email, String zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.zipCode = zipCode;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password="
				+ password + ", telephone=" + telephone + ", email=" + email
				+ ", zipCode=" + zipCode + "]";
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		//当customer和session绑定时会触发此方法，也即登录成功，登录成功时产生购物车对象
		HttpSession session = event.getSession();
		ShopCar car = new ShopCar();
		session.setAttribute("car", car);
		
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
