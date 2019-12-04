package com.briup.bean;
/**
 * 订单项
 * */
public class Line {
	private Long id;
	private int num;
	private double cost;
	private Book book;
	private Order order;
	public Line(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Line [id=" + id + ", num=" + num + ", cost=" + cost + "]";
	}
	
}
