package com.briup.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 购物车
 * map<商品id,订单项>
 * */
public class ShopCar implements Serializable{
	private Long id;
	private Customer customer;
	private double total;
	public ShopCar(){}
	public ShopCar(Long id, Customer customer, double total) {
		super();
		this.id = id;
		this.customer = customer;
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "ShopCar [id=" + id + ", customer=" + customer + ", total=" + total + "]";
	}
}
