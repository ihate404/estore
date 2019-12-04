package com.briup.bean;

import java.util.Date;

/**
 * 订单
 * */
public class Order {
	private Long id;
	private double cost;
	private Date orderDate;
	private Customer customer;
	private Address address;
	public Order(){}
	public Order(Long id, double cost, Date orderDate) {
		super();
		this.id = id;
		this.cost = cost;
		this.orderDate = orderDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", cost=" + cost + ", orderDate="
				+ orderDate + "]";
	}
	
	
}
